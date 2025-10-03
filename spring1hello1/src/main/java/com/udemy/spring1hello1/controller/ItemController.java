package com.udemy.spring1hello1.controller;

import com.udemy.spring1hello1.model.Item;
import com.udemy.spring1hello1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/items/{itemId}")
    public Item getItem(@PathVariable("itemId") String itemId) {
        return itemService.getItem(itemId);
    }

    @PostMapping("/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/items/{itemId}")
    public void updateItem(@RequestBody Item item, @PathVariable("itemId") String itemId) {
        itemService.updateItem(itemId, item);
    }

    @DeleteMapping("/items/{itemId}")
    public void deleteItem(@PathVariable("itemId") String itemId) {
        itemService.deleteItem(itemId);
    }

}
