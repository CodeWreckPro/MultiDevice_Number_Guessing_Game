package com.rakshith.numberguessinggame;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GameControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testJoinGame() throws Exception {
        mockMvc.perform(post("/game/join")
                        .param("playerName", "Player1"))
                .andExpect(status().isOk());
    }

    @Test
    void testStartGame() throws Exception {
        mockMvc.perform(post("/game/start"))
                .andExpect(status().isOk());
    }

    @Test
    void testStopGame() throws Exception {
        mockMvc.perform(post("/game/stop"))
                .andExpect(status().isOk());
    }
}

