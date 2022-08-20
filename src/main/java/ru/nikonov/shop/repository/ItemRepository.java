package ru.nikonov.shop.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Component;
import ru.nikonov.shop.model.Item;

@Component
public class ItemRepository {

    private Map<Integer, Item> table = new HashMap<>();
    private Integer lastId = 0;

    public Optional<Item> findById(Integer id) {
        return Optional.ofNullable(table.get(id));
    }

    public Item save(Item item) {
        Integer id = item.getId();
        if (id == null) {
            id = generateId();
            item.setId(id);
        } else {
            findById(id).orElseThrow(() -> new RuntimeException("Not found item with id: " + item.getId()));
        }
        table.put(id, item);
        return item;
    }

    private Integer generateId() {
        return ++lastId;
    }

}
