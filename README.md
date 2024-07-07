# Number Guessing Game

A multi-player number guessing game built with Java, Spring Boot, and web technologies, designed to be hosted locally and accessed by multiple devices on the same Wi-Fi network.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Features](#features)
- [Setup](#setup)
- [Usage](#usage)
- [How the Project Works](#how-the-project-works)
- [Game Rules](#game-rules)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

- **Backend**: Java, Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Build Tool**: Maven

## Features

- Multi-player gameplay on the same Wi-Fi network
- Players enter their names and see personalized game screens
- Turn-based gameplay with prompts and guesses
- Scores displayed at the end of the game

## Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/number-guessing-game.git
    cd number-guessing-game
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

4. **Access the game**:
    Open a web browser on any device connected to the same Wi-Fi network and navigate to:
    ```
    http://<host-device-ip>:8080
    ```

## Usage

- **Start the Game**: Only the host device can start and stop the game.
- **Join the Game**: Enter your name on the webpage to join.
- **Play the Game**: Follow the prompts, describe your number, and guess other players' numbers.

## How the Project Works

The project consists of a backend built with Spring Boot and a frontend using standard web technologies (HTML, CSS, JavaScript). Here’s a breakdown of the key components:

- **Backend**:
  - `Application.java`: The main entry point of the Spring Boot application.
  - `GameController.java`: Handles HTTP requests and routes them to the appropriate service methods.
  - `GameService.java`: Contains the core game logic, such as starting/stopping the game, managing players, and processing guesses.
  - `Player.java` and `Game.java`: Models representing players and the game state, respectively.

- **Frontend**:
  - `index.html`: The main HTML file that includes the game interface.
  - `styles.css`: CSS for styling the game interface.
  - `script.js`: JavaScript for handling user interactions and communication with the backend.

- **Game Flow**:
  - When the host starts the game, all players are prompted to enter their names.
  - Players take turns describing a number with a prompt within 30 seconds.
  - Other players then guess the number within the next 30 seconds.
  - The game cycles through all players for three rounds and then displays the final scores.

## Game Rules

1. Players enter their names to join.
2. The game cycles through each player, who must enter a number and a prompt within 30 seconds.
3. Other players guess the number based on the prompt within 30 seconds.
4. The game repeats for three rounds.
5. Scores are calculated and displayed at the end.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

