package com.udemy.spring1hello1;

import com.udemy.spring1hello1.model.Item;
import com.udemy.spring1hello1.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Spring1hello1Application extends SpringBootServletInitializer implements CommandLineRunner {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Spring1hello1Application.class);
    }

    @Autowired
    private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring1hello1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        itemRepository.save(new Item("ネックレス", "ジュエリ"));
        itemRepository.save(new Item("パーカー", "ファッション"));
        itemRepository.save(new Item("フェイスクリーム", "ビューティー"));
        itemRepository.save(new Item("サプリメント", "ヘルス"));
        itemRepository.save(new Item("ブルーベリー", "フード"));
    }
}
