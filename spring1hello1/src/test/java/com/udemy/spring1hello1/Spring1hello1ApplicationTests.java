package com.udemy.spring1hello1;

import com.udemy.spring1hello1.controller.ItemController;
import com.udemy.spring1hello1.repo.ItemRepository;
import com.udemy.spring1hello1.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class Spring1hello1ApplicationTests {

    @Autowired
    private ItemController itemController;

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemRepository itemRepository;

	@Test
	void contextLoads() {
        assertThat(itemController).isNotNull();
        assertThat(itemService).isNotNull();
        assertThat(itemRepository).isNotNull();
	}

}
