package com.mygym.projects.resource;

import com.mygym.projects.model.Droid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/droid")
public class DroidResource {

    private final Droid droid;

    DroidResource(Droid droid) {
        this.droid = droid;
    }

    @GetMapping
    Droid get() {
        return droid;
    }

}
