package ru.nikonov.shop.model;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Item {

    Integer id;
    String name;
}
