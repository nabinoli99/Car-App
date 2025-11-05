package com.nstrivex.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    private final Engines electricalEngine;
    private final Engines petrolEngine;

    @Autowired
    public Car(@Qualifier("electricCar") Engines electricEngine,
               @Qualifier("petrolCar") Engines petrolEngine)
    {
        this.electricalEngine = electricEngine;
        this.petrolEngine = petrolEngine;
    }

    @GetMapping("/electricengine")
    public String electricEngine()
    {
        return electricalEngine.eng();
    }

    @GetMapping("/petrolengine")
    public String petrolEngine()
    {
        return petrolEngine.engs();
    }
}