package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void shouldReturnDefaultMessage() throws Exception {
                this.mockMvc.perform(get("/"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, World!")));

        }

        @Test
        public void shouldReturnDefaultMessage1() throws Exception {
                this.mockMvc.perform(get("/Rebeka"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Rebeka!")));

        }

        @Test
        public void shouldReturnDefaultMessage2() throws Exception {
                this.mockMvc.perform(get("/RebekaClone"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, RebekaClone!")));

        }

        @Test
        public void shouldReturnDefaultMessage3() throws Exception {
                this.mockMvc.perform(get("/hotfix"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hotfix endpoint funcionando!")));

        }

        @Test
        public void shouldReturnDefaultMessage4() throws Exception {
                this.mockMvc.perform(get("/jenkins"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("jenkins funcionando!")));

        }

}