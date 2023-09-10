package practice.cloud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static practice.cloud.controller.QuizController.*;

@ExtendWith(MockitoExtension.class)
class QuizControllerTest {

    @InjectMocks
    private QuizController controller = new QuizController();

    private MockMvc mockMvc;

    private ObjectMapper objectMapper;

    @BeforeEach
    void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    @DisplayName("/hello로 Get 요청시 Hello 객체를 Json 형식으로 반환")
    void getHello() throws Exception {
        //given
        Hello hello = new Hello("hello-world");

        String responseJson = objectMapper
                .writeValueAsString(hello);

        //expected
        mockMvc.perform(MockMvcRequestBuilders.get("/hello")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(content().json(responseJson))
                .andDo(MockMvcResultHandlers.print());
    }
}