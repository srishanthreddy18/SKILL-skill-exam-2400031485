package com.klef.ms.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
public class ExaminationIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testViewAllExaminations() throws Exception {

        MvcResult result =
                mockMvc.perform(get("/examination/displayall"))
                .andExpect(status().isOk())
                .andReturn();

        String response =
                result.getResponse().getContentAsString();

        System.out.println(response);

        assertNotNull(response);
    }

    @Test
    void testViewExaminationById() throws Exception {

        MvcResult result =
                mockMvc.perform(get("/examination/display/1"))
                .andExpect(status().isOk())
                .andReturn();

        String response =
                result.getResponse().getContentAsString();

        System.out.println(response);

        assertNotNull(response);
    }

    @Test
    void testViewByName() throws Exception {

        MvcResult result =
                mockMvc.perform(
                        get("/examination/displaybyname/Mid Semester Examination"))
                .andExpect(status().isOk())
                .andReturn();

        String response =
                result.getResponse().getContentAsString();

        System.out.println(response);

        assertNotNull(response);
    }

    @Test
    void testViewByType() throws Exception {

        MvcResult result =
                mockMvc.perform(
                        get("/examination/displaybytype/Internal"))
                .andExpect(status().isOk())
                .andReturn();

        String response =
                result.getResponse().getContentAsString();

        System.out.println(response);

        assertNotNull(response);
    }
}