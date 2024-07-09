let playerName = '';

function joinGame() {
    playerName = document.getElementById('player-name').value;
    if (playerName) {
        fetch('/game/join', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: `playerName=${playerName}`
        }).then(() => {
            document.getElementById('player-info').style.display = 'none';
            document.getElementById('game-screen').style.display = 'block';
            document.getElementById('player-display-name').innerText = playerName;
        });
    }
}

function submitNumber() {
    const number = document.getElementById('number').value;
    const prompt = document.getElementById('prompt').value;

    fetch('/game/submit', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: `playerName=${playerName}&number=${number}&prompt=${prompt}`
    }).then(() => {
        document.getElementById('number-input').style.display = 'none';
    });
}

function submitGuess() {
    const guess = document.getElementById('guess').value;

    fetch('/game/guess', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: `playerName=${playerName}&guess=${guess}`
    }).then(() => {
        document.getElementById('guess-input').style.display = 'none';
    });
}

function updateGameStatus() {
    fetch('/game/score')
        .then(response => response.json())
        .then(data => {
            const gameStatus = document.getElementById('game-status');
            gameStatus.innerHTML = '';

            data.forEach(player => {
                const playerStatus = document.createElement('div');
                playerStatus.innerText = `${player.name}: ${player.score}`;
                gameStatus.appendChild(playerStatus);
            });

            // Additional logic to show the appropriate input fields based on game state
            // Here we need more details from the server to know the current game state
        });
}

// Polling to update game status every 0.5 seconds
setInterval(updateGameStatus, 500);

