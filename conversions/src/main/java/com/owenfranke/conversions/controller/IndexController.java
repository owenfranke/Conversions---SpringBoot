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

    @RequestMapping("length/metre/{input}")
    public String fromMetre(@PathVariable(value = "input") double input) {
        return conversion.metre(input);
    }

    @RequestMapping("length/foot/{input}")
    public String fromFoot(@PathVariable(value = "input") double input) {
        return conversion.foot(input);
    }

    @RequestMapping("length/kilometre/{input}")
    public String fromKm(@PathVariable(value = "input") double input) {
        return conversion.kilometre(input);
    }

    @RequestMapping("length/mile/{input}")
    public String fromMile(@PathVariable(value = "input") double input) {
        return conversion.mile(input);
    }

    // Area:
    @RequestMapping("area/squarefoot/{input}")
    public String fromSF(@PathVariable(value = "input") double input) {
        return conversion.squareFoot(input);
    }

    @RequestMapping("area/rood/{input}")
    public String fromRood(@PathVariable(value = "input") double input) {
        return conversion.rood(input);
    }

    @RequestMapping("area/acre/{input}")
    public String fromAcre(@PathVariable(value = "input") double input) {
        return conversion.acre(input);
    }

    @RequestMapping("area/hectare/{input}")
    public String fromHectare(@PathVariable(value = "input") double input) {
        return conversion.hectare(input);
    }

    @RequestMapping("area/squaremetre/{input}")
    public String fromSM(@PathVariable(value = "input") double input) {
        return conversion.squareMetre(input);
    }

    @RequestMapping("area/squarekilometre/{input}")
    public String fromSquareKilometer(@PathVariable(value = "input") double input) {
        return conversion.squareKilometre(input);
    }

    // Mass:
    @RequestMapping("mass/ounce/{input}")
    public String fromOunce(@PathVariable(value = "input") double input) {
        return conversion.ounce(input);
    }

    @RequestMapping("mass/pound/{input}")
    public String fromPound(@PathVariable(value = "input") double input) {
        return conversion.pound(input);
    }

    @RequestMapping("mass/stone/{input}")
    public String fromStone(@PathVariable(value = "input") double input) {
        return conversion.stone(input);
    }

    @RequestMapping("mass/miligrams/{input}")
    public String fromMiligrams(@PathVariable(value = "input") double input) {
        return conversion.miligrams(input);
    }

    @RequestMapping("mass/grams/{input}")
    public String fromGrams(@PathVariable(value = "input") double input) {
        return conversion.grams(input);
    }

    @RequestMapping("mass/kilograms/{input}")
    public String fromKM(@PathVariable(value = "input") double input) {
        return conversion.kiloGrams(input);
    }

    // Volumes:
    @RequestMapping("volume/ounce/{input}")
    public String fromFluidOunce(@PathVariable(value = "input") double input) {
        return conversion.fluidOunce(input);
    }

    @RequestMapping("volume/pint/{input}")
    public String fromPint(@PathVariable(value = "input") double input) {
        return conversion.pint(input);
    }

    @RequestMapping("volume/gallon/{input}")
    public String fromGallon(@PathVariable(value = "input") double input) {
        return conversion.gallon(input);
    }

    @RequestMapping("volume/mililitre/{input}")
    public String fromMililitre(@PathVariable(value = "input") double input) {
        return conversion.mililitre(input);
    }

    @RequestMapping("volume/litre/{input}")
    public String fromLitre(@PathVariable(value = "input") double input) {
        return conversion.litre(input);
    }

    @RequestMapping("volume/kilolitre/{input}")
    public String fromKilolitre(@PathVariable(value = "input") double input) {
        return conversion.kiloLitre(input);
    }

}