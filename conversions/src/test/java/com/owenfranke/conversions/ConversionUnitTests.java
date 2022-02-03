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
        String expected = "Imperial:\nInches: 19.685\nFeet: 1.6404199475065617\nMiles: 3.1068636832490336E-4";
        String actual = conversionUtil.centimetre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testFoot() {
        String expected = "Metric:\nCentimetre: 1524.0\nMetre: 15.239256324291373\nkilometre: 0.015239256324291375";
        String actual = conversionUtil.foot(50);
        assertEquals(expected, actual);
    }

    @Test
    void testInche() {
        String expected = "Metric:\nCentimetre: 127.0\nMetre: 1.27000254000508\nkilometre: 0.00127000254000508";
        String actual = conversionUtil.inche(50);
        assertEquals(expected, actual);
    }

    @Test
    void testGallon() {
        String expected = "Metric:\nMililiters: 189270.5\nLitres: 189.2705\nKilolitres: 0.1892705";
        String actual = conversionUtil.gallon(50);
        assertEquals(expected, actual);
    }

    @Test
    void testGrams() {
        String expected = "Imperial:\nOunces: 1.7621145374449338\nStone: 0.007866582756450597\nPounds: 0.11013215859030837";
        String actual = conversionUtil.grams(50);
        assertEquals(expected, actual);
    }

    @Test
    void testHectare() {
        String expected = "Metric:\nSquareFeet: 5381950.0\nRood: 494.2102846648301\nAcre: 123.55257116620753";
        String actual = conversionUtil.hectare(50);
        assertEquals(expected, actual);
    }

    @Test
    void testKiloGrams() {
        String expected = "Imperial:\nOunces: 1763.696\nStone: 7.8736428571428565\nPounds: 110.231";
        String actual = conversionUtil.kiloGrams(50);
        assertEquals(expected, actual);
    }

    @Test
    void testKiloLitre() {
        String expected = "Imperial:\nOunce: 1690700.0\nPint:105668.75\nGallon: 13208.59375";
        String actual = conversionUtil.kiloLitre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testKilometre() {
        String expected = "Imperial:\nInches: 1968500.0\nFeet: 164050.0\nMiles: 31.07520198881293";
        String actual = conversionUtil.kilometre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testLitre() {
        String expected = "Imperial:\nOunce: 1.3208608842899448E-5\nPint:8.255380526812155E-7\nGallon: 1.0319225658515194E-7";
        String actual = conversionUtil.litre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testMetre() {
        String expected = "Imperial:\nInches: 1968.4999999999998\nFeet: 164.05\nMiles: 0.031075201988812928";
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
        String expected = "Imperial:\nOunces: 1.76\nStone: 0.007857142857142858\nPounds: 0.11";
        String actual = conversionUtil.miligrams(50);
        assertEquals(expected, actual);
    }

    @Test
    void testMililitre() {
        String expected = "Imperial:\nOunce: 0.013208608842899448\nPint:8.255380526812155E-4\nGallon: 1.0319225658515194E-4";
        String actual = conversionUtil.mililitre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testOunce() {
        String expected = "Metric:\nMiligrams: 1417.475\nGrams: 1.4174749999999998\nKilograms: 0.0014174749999999999";
        String actual = conversionUtil.ounce(50);
        assertEquals(expected, actual);
    }

    @Test
    void testFluidOunce() {
        String expected = "Metric:\nMililiters: 1478.675\nLitres: 1.478675\nKilolitres: 0.001478675";
        String actual = conversionUtil.fluidOunce(50);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPint() {
        String expected = "Metric:\nMililiters: 23658.5\nLitres: 23.6585\nKilolitres: 0.0236585";
        String actual = conversionUtil.pint(50);
        assertEquals(expected, actual);
    }

    @Test
    void testPound() {
        String expected = "Metric:\nMiligrams: 2.26796E7\nGrams: 22679.6\nKilograms: 22.679599999999997";
        String actual = conversionUtil.pound(50);
        assertEquals(expected, actual);
    }

    @Test
    void testAcre() {
        String expected = "Imperial:\nSquareMetre: 48563.334682314846\nHectare: 4.856333468231485\nSquare Kilometre: 0.04856333468231485";
        String actual = conversionUtil.acre(12);
        assertEquals(expected, actual);
    }

    @Test
    void testRood() {
        String expected = "Imperial:\nSquareMetre: 50585.7053\nHectare: 5.05857053\nSquare Kilometre: 0.0505857053";
        String actual = conversionUtil.rood(50);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareFoot() {
        String expected = "Imperial:\nSquareMetre: 4.645156495322327\nHectare: 4.645156495322327E-4\nSquare Kilometre: 4.645156495322327E-6";
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
        String expected = "Metric:\nSquareFeet: 538.1999999999999\nRood: 0.04942148760330578\nAcre: 0.012355371900826445";
        String actual = conversionUtil.squareMetre(50);
        assertEquals(expected, actual);
    }

    @Test
    void testStone() {
        String expected = "Metric:\nMiligrams: 3.175145E8\nGrams: 317514.5\nKilograms: 317.5145";
        String actual = conversionUtil.stone(50);
        assertEquals(expected, actual);
    }
}
