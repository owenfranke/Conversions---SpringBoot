package com.owenfranke.conversions.controller;

import com.owenfranke.conversions.service.Conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    Conversion conversion;

    // Temperature
    @RequestMapping("temperature/celsius/{input}")
    public String fromCelsius(@PathVariable(value = "input") double input) {
        return conversion.celsius(input);
    }

    @RequestMapping("temperature/farenheit/{input}")
    public String fromFarenheit(@PathVariable(value = "input") double input) {
        return conversion.farenheit(input);
    }

    // Lengths
    @RequestMapping("length/inch/{input}")
    public String fromInches(@PathVariable(value = "input") double input) {
        return conversion.inche(input);
    }

    @RequestMapping("length/centimetre/{input}")
    public String fromCm(@PathVariable(value = "input") double input) {
        return conversion.centimetre(input);
    }
    

}