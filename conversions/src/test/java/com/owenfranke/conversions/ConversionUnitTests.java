package com.owenfranke.conversions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.owenfranke.conversions.util.ConversionUtil;
import com.owenfranke.conversions.util.ConversionUtilImpl;

import org.junit.jupiter.api.Test;

public class ConversionUnitTests {
    ConversionUtil conversionUtil = new ConversionUtilImpl();

    // Temperature:
    @Test
    void testCelsius() {

        String expected = "In Farenheit: 53.0";
        String actual = conversionUtil.celsius(12);
        assertEquals(expected, actual);
    }

    @Test
    void testFarenheit() {

        String expected = "In Celsius: -11.0";
        String actual = conversionUtil.farenheit(12);
        assertEquals(expected, actual);
    }

    // Lengths:
    @Test
    void testCentimetre() {
        String expected = "Imperial:\nInches: 19.69\nFeet: 1.64\nMiles: 0.0";
        String actual = conversionUtil.centimetre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testFoot() {
        String expected = "Metric:\nCentimetre: 1524.0\nMetre: 15.24\nkilometre: 0.02";
        String actual = conversionUtil.foot(50);
        assertEquals(expected, actual);
    }

    @Test
    void testInche() {
        String expected = "Metric:\nCentimetre: 127.0\nMetre: 1.27\nkilometre: 0.0";
        String actual = conversionUtil.inche(50);
        assertEquals(expected, actual);
    }

    @Test
    void testGallon() {
        String expected = "Metric:\nMililiters: 189270.5\nLitres: 189.27\nKilolitres: 0.19";
        String actual = conversionUtil.gallon(50);
        assertEquals(expected, actual);
    }

    @Test
    void testGrams() {
        String expected = "Imperial:\nOunces: 1.76\nStone: 0.01\nPounds: 0.11";
        String actual = conversionUtil.grams(50);
        assertEquals(expected, actual);
    }

    @Test
    void testHectare() {
        String expected = "Metric:\nSquareFeet: 5381950.0\nRood: 494.21\nAcre: 123.55";
        String actual = conversionUtil.hectare(50);
        assertEquals(expected, actual);
    }

    @Test
    void testKiloGrams() {
        String expected = "Imperial:\nOunces: 1763.7\nStone: 7.87\nPounds: 110.23";
        String actual = conversionUtil.kiloGrams(50);
        assertEquals(expected, actual);
    }

    @Test
    void testKiloLitre() {
        String expected = "Imperial:\nOunce: 1690700.0\nPint: 105668.75\nGallon: 13208.59";
        String actual = conversionUtil.kiloLitre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testKilometre() {
        String expected = "Imperial:\nInches: 1968500.0\nFeet: 164050.0\nMiles: 31.08";
        String actual = conversionUtil.kilometre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testLitre() {
        String expected = "Imperial:\nOunce: 1690.7\nPint: 105.67\nGallon: 13.21";
        String actual = conversionUtil.litre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testMetre() {
        String expected = "Imperial:\nInches: 1968.5\nFeet: 164.05\nMiles: 0.03";
        String actual = conversionUtil.metre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testMile() {
        String expected = "Metric:\nCentimetre: 8046720.0\nMetre: 80467.0\nkilometre: 80.45";
        String actual = conversionUtil.mile(50);
        assertEquals(expected, actual);
    }

    @Test
    void testMiligrams() {
        String expected = "Imperial:\nOunces: 1.76\nStone: 0.01\nPounds: 0.11";
        String actual = conversionUtil.miligrams(50);
        assertEquals(expected, actual);
    }

    @Test
    void testMililitre() {
        String expected = "Imperial:\nOunce: 0.01\nPint: 0.0\nGallon: 0.0";
        String actual = conversionUtil.mililitre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testOunce() {
        String expected = "Metric:\nMiligrams: 1417.48\nGrams: 1.42\nKilograms: 0.0";
        String actual = conversionUtil.ounce(50);
        assertEquals(expected, actual);
    }

    @Test
    void testFluidOunce() {
        String expected = "Metric:\nMililiters: 1478.68\nLitres: 1.48\nKilolitres: 0.0";
        String actual = conversionUtil.fluidOunce(50);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPint() {
        String expected = "Metric:\nMililiters: 23658.5\nLitres: 23.66\nKilolitres: 0.02";
        String actual = conversionUtil.pint(50);
        assertEquals(expected, actual);
    }

    @Test
    void testPound() {
        String expected = "Metric:\nMiligrams: 2.26796E7\nGrams: 22679.6\nKilograms: 22.68";
        String actual = conversionUtil.pound(50);
        assertEquals(expected, actual);
    }

    @Test
    void testAcre() {
        String expected = "Imperial:\nSquareMetre: 48563.33\nHectare: 4.86\nSquare Kilometre: 0.05";
        String actual = conversionUtil.acre(12);
        assertEquals(expected, actual);
    }

    @Test
    void testRood() {
        String expected = "Imperial:\nSquareMetre: 50585.71\nHectare: 5.06\nSquare Kilometre: 0.05";
        String actual = conversionUtil.rood(50);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareFoot() {
        String expected = "Imperial:\nSquareMetre: 4.65\nHectare: 0.0\nSquare Kilometre: 0.0";
        String actual = conversionUtil.squareFoot(50);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareKilometre() {
        String expected = "Metric:\nSquareFeet: 5.3819469E8\nRood: 49421.0\nAcre: 12355.25";
        String actual = conversionUtil.squareKilometre(50);
        assertEquals(expected, actual);

    }

    @Test
    void testSquareMetre() {
        String expected = "Metric:\nSquareFeet: 538.2\nRood: 0.05\nAcre: 0.01";
        String actual = conversionUtil.squareMetre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testStone() {
        String expected = "Metric:\nMiligrams: 3.175145E8\nGrams: 317514.5\nKilograms: 317.51";
        String actual = conversionUtil.stone(50);
        assertEquals(expected, actual);
    }
}
