//Owen Franke
//Implementation of Service Layer

package com.owenfranke.conversions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.owenfranke.conversions.util.ConversionUtil;

@Service
public class ConversionImpl implements Conversion {

    @Autowired
    ConversionUtil conversionUtil;

    @Override
    public String celsius(double input) {
        return conversionUtil.celsius(input);
        
    }

    @Override
    public String farenheit(double input) {
        return conversionUtil.farenheit(input);

    }

    @Override
    public String centimetre(double input) {
        return conversionUtil.centimetre(input);

    }

    @Override
    public String inche(double input) {
        return conversionUtil.inche(input);

    }

    @Override
    public String foot(double input) {
        return conversionUtil.foot(input);

    }

    @Override
    public String mile(double input) {
        return conversionUtil.mile(input);

    }

    @Override
    public String kilometre(double input) {
        return conversionUtil.kilometre(input);

    }

    @Override
    public String fluidOunce(double input) {
        return conversionUtil.fluidOunce(input);

    }

    @Override
    public String pint(double input) {
        return conversionUtil.pint(input);

    }

    @Override
    public String gallon(double input) {
        return conversionUtil.gallon(input);

    }

    @Override
    public String mililitre(double input) {
        return conversionUtil.mililitre(input);

    }

    @Override
    public String litre(double input) {
        return conversionUtil.litre(input);
    }

    @Override
    public String kiloLitre(double input) {
        return conversionUtil.kiloLitre(input);

    }

    @Override
    public String ounce(double input) {
        return conversionUtil.ounce(input);

    }

    @Override
    public String pound(double input) {
        return conversionUtil.pound(input);

    }

    @Override
    public String stone(double input) {
        return conversionUtil.stone(input);

    }

    @Override
    public String miligrams(double input) {
        return conversionUtil.miligrams(input);

    }

    @Override
    public String grams(double input) {
        return conversionUtil.grams(input);

    }

    @Override
    public String kiloGrams(double input) {
        return conversionUtil.kiloGrams(input);

    }

    @Override
    public String squareFoot(double input) {
        return conversionUtil.squareFoot(input);

    }

    @Override
    public String rood(double input) {
        return conversionUtil.rood(input);
    }

    @Override
    public String acre(double input) {
        return conversionUtil.acre(input);
    }

    @Override
    public String hectare(double input) {
        return conversionUtil.hectare(input);
    }

    @Override
    public String squareMetre(double input) {
        return conversionUtil.squareMetre(input);
    }

    @Override
    public String squareKilometre(double input) {
        return conversionUtil.squareKilometre(input);
    }

    @Override
    public String metre(double input) {
        return conversionUtil.metre(input);
    }

}
