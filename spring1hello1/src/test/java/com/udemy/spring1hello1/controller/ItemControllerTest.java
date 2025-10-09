package com.udemy.spring1hello1.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.udemy.spring1hello1.model.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetItem() throws Exception {
        int itemId = 1;
        String responseJsonString = mockMvc.perform(get("/items/{itemId}", itemId)
                .contentType(String.valueOf(MediaType.APPLICATION_JSON))
                .accept(String.valueOf(MediaType.APPLICATION_JSON_UTF_8))
                .characterEncoding("UTF-8"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();

        ObjectMapper objectMapper = new ObjectMapper();
        Item responseItem= objectMapper.readValue(responseJsonString, Item.class);

        assertThat(responseItem.getItemId()).isEqualTo(1L);
        assertThat(responseItem.getItemName()).isEqualTo("ネックレス");
        assertThat(responseItem.getItemCategory()).isEqualTo("ジュエリ");
    }
}