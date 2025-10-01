package com.udemy.spring1hello1.service;

import com.udemy.spring1hello1.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {
    private final List<Item> allItems =  new ArrayList<>(Arrays.asList(
            new Item("10001", "ネックレス", "ジュエル"),
                new Item("10002", "パーカー", "ファッション"),
                new Item("10003", "フェイスクリーム", "ビューティー"),
                new Item("10004", "サプリメント", "ヘルス"),
                new Item("10005", "ブルーベリー", "フード")
        ));

    public List<Item> getAllItems() {
        return allItems;
    }

    public Item getItem(String itemId) {
        for (Item allItem : allItems) {
            if (allItem.getItemId().equals(itemId)) {
                return (Item) allItem;
            }
        }
        return null;
    }

    public void addItem(Item item) {
        allItems.add(item);
    }
}
