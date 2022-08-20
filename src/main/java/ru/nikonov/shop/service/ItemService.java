package ru.nikonov.shop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nikonov.shop.dto.ItemRequest;
import ru.nikonov.shop.model.Item;
import ru.nikonov.shop.repository.ItemRepository;

@Service
@AllArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item createItem(ItemRequest request) {
        return itemRepository.save(new Item().setName(request.getName()));
    }

    public Item putItem(Integer id, ItemRequest request) {
        return itemRepository.save(new Item()
                                       .setName(request.getName())
                                       .setId(id));
    }

    public Item getItem(Integer id) {
        return itemRepository.findById(id).get();
    }
}
