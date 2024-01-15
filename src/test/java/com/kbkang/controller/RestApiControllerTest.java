package com.kbkang.controller;

import com.kbkang.service.ExternalApiService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class RestApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ExternalApiService externalApiService; // MockBean으로 서비스 Mocking

    @Test
    public void testReqByGetEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/reqByGet")
                        .param("token", "your_token_here")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("접근 성공"));

        // externalApiService.fetchDataByGet() 메서드가 호출되었는지 확인
        Mockito.verify(externalApiService, Mockito.times(1)).fetchDataByGet();
    }

    @Test
    public void testReqByPostEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/reqByPost")
                        .param("token", "your_token_here")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("접근 성공"));

        // externalApiService.fetchDataByPost() 메서드가 호출되었는지 확인
        Mockito.verify(externalApiService, Mockito.times(1)).fetchDataByPost();
    }
}