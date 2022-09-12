package com.mygym.projects.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/greeting")
public class GreetingResourceV1 {

    // позволяет использовать значения по умолчанию
    @Value("${greeting-name:Sasha}")
    private String name;

    // позволяет использовать составные проперти,
    // однако составные части должны быть определены иначе, приложение упадет
    @Value("${greeting-coffee: ${greeting-name:Andrew} is Drinking coffee}")
    private String coffee;

    @GetMapping
    String getName() {
        return name;
    }

    @GetMapping("/coffee")
    String getCoffee() {
        return coffee;
    }
}
