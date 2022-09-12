package com.mygym.projects.resource;

import com.mygym.projects.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2/greeting")
public class GreetingResourceV2 {

    private final Greeting greeting;

    GreetingResourceV2(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    String getName() {
        return greeting.getName();
    }

    @GetMapping("/coffee")
    String getCoffee() {
        return greeting.getCoffee();
    }

}
