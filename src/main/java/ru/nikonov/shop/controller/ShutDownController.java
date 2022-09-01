package ru.nikonov.shop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShutDownController {

    @PostMapping("/exit")
    public void shutDown() {
        System.exit(0);
    }
}
