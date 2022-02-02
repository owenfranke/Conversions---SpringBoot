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
        // TODO Auto-generated method stub
        return conversionUtil.celsius(input);
        
    }

    @Override
    public String farenheit(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.farenheit(input);

    }

    @Override
    public String centimetre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.centimetre(input);

    }

    @Override
    public String inche(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.inche(input);

    }

    @Override
    public String foot(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.foot(input);

    }

    @Override
    public String mile(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.mile(input);

    }

    @Override
    public String kilometre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.kilometre(input);

    }

    @Override
    public String fluidOunce(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.fluidOunce(input);

    }

    @Override
    public String pint(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.pint(input);

    }

    @Override
    public String gallon(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.gallon(input);

    }

    @Override
    public String mililitre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.mililitre(input);

    }

    @Override
    public String litre(double input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String kiloLitre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.kiloLitre(input);

    }

    @Override
    public String ounce(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.ounce(input);

    }

    @Override
    public String pound(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.pound(input);

    }

    @Override
    public String stone(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.stone(input);

    }

    @Override
    public String miligrams(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.miligrams(input);

    }

    @Override
    public String grams(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.grams(input);

    }

    @Override
    public String kiloGrams(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.kiloGrams(input);

    }

    @Override
    public String squareFoot(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.squareFoot(input);

    }

    @Override
    public String rood(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.rood(input);
    }

    @Override
    public String acre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.acre(input);
    }

    @Override
    public String hectare(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.hectare(input);
    }

    @Override
    public String squareMetre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.squareMetre(input);
    }

    @Override
    public String squareKilometre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.squareKilometre(input);
    }

    @Override
    public String metre(double input) {
        // TODO Auto-generated method stub
        return conversionUtil.metre(input);
    }

}
