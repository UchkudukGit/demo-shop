package ru.nikonov.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nikonov.shop.dto.ItemRequest;
import ru.nikonov.shop.model.Item;
import ru.nikonov.shop.service.ItemService;

@RestController
@RequestMapping(path = "/item")
public class ItemController {

    @Autowired
    ItemService service;

    @PostMapping
    public Item createItem(@RequestBody ItemRequest request) {
        return service.createItem(request);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable(name = "id") Integer id, @RequestBody ItemRequest request) {
        return service.putItem(id, request);
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable(name = "id") Integer id) {
        return service.getItem(id);
    }
}
