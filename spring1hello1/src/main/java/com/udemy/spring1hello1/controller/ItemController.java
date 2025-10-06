package com.udemy.spring1hello1.controller;

import com.udemy.spring1hello1.exception.ItemNotFoundException;
import com.udemy.spring1hello1.model.Item;
import com.udemy.spring1hello1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Cacheable("getItems")
    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @Cacheable(value="getItem", key="#itemId")
    @GetMapping("/items/{itemId}")
    public Item getItem(@PathVariable("itemId") Long itemId) {
        return itemService.getItem(itemId).orElseThrow(() -> new ItemNotFoundException(itemId));
    }

    @PostMapping("/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/items/{itemId}")
    public void updateItem(@RequestBody Item item, @PathVariable("itemId") Long itemId) {
        itemService.updateItem(itemId, item);
    }

    @DeleteMapping("/items/{itemId}")
    public void deleteItem(@PathVariable("itemId") Long itemId) {
        itemService.deleteItem(itemId);
    }

}
