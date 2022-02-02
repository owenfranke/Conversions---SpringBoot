package com.owenfranke.conversions.util;

import org.springframework.stereotype.Component;

@Component
public class ConversionUtilImpl implements ConversionUtil {

    public ConversionUtilImpl() {
        super();

    }

    // Temperature:
    @Override
    public String celsius(double cel) {

        double far = (cel * 1.8) + 32;
        far = Math.round(far * 100) / 100;
        return "In Farenheit: " + far;
    }

    @Override
    public String farenheit(double far) {
        double cel = (far - 32) / 1.8;
        cel = Math.round(cel * 100) / 100;
        return "In Celsius: " + cel;
    }

    // Length:

    @Override
    public String inche(double inch) {
        double cm = inch * 2.54;
        double metre = inch / 39.37;
        double kilometre = inch / 39370;
        ;
        return "Metrical:\nCentimetre: " + cm + "\nMetre" + metre + "\nkilometre: " + kilometre;
    }

    @Override
    public String foot(double foot) {
        double cm = foot * 30.48;
        double metre = foot / 3.281;
        double kilometre = foot / 3281;
        return "Metrical:\nCentimetre: " + cm + "\nMetre" + metre + "\nkilometre: " + kilometre;
    }

    @Override
    public String mile(double mile) {
        double cm = mile * 160934.4;
        double metre = mile * 1609.34;
        double kilometre = mile * 1.609;
        return "Metrical:\nCentimetre: " + cm + "\nMetre" + metre + "\nkilometre: " + kilometre;
    }

    @Override
    public String centimetre(double cm) {

        double inch = cm * 0.39370;
        double foot = cm / 30.48;
        double mile = cm / 160934;

        return "Imperial:\n+Inches: " + inch + "\nfeet" + foot + "\nmiles: " + mile;
    }

    @Override
    public String kilometre(double km) {
        double inch = km * 39370;
        double foot = km * 3281;
        double mile = km / 1.609;
        return "Imperial:\n+Inches: " + inch + "\nfeet" + foot + "\nmiles: " + mile;
    }

    @Override
    public String metre(double metre) {
        double inch = metre * 39.37;
        double foot = metre * 3.281;
        double mile = (metre / 1.609) / 1000;
        return "Imperial:\nInches: " + inch + "\nfeet" + foot + "\nmiles: " + mile;
    }

    // Volume:
    @Override
    public String fluidOunce(double ounce) {
        double ml = ounce * 29.5735;
        double l = ml / 1000;
        double kl = l / 1000;
        return "Metric:\nMililiters: " + ml + "\nLitres" + l + "\nKilolitres: " + kl;

    }

    @Override
    public String pint(double pint) {
        double ml = pint * 473.17;
        double l = ml / 1000;
        double kl = l / 1000;
        return "Metric:\nMililiters: " + ml + "\nLitres" + l + "\nKilolitres: " + kl;
    }

    @Override
    public String gallon(double gal) {
        double ml = gal * 3785.41;
        double l = ml / 1000;
        double kl = l / 1000;
        return "Metric:\nMililiters: " + ml + "\nLitres" + l + "\nKilolitres: " + kl;
    }

    @Override
    public String mililitre(double ml) {
        double ounce = ml / 3785.41;
        double pint = ounce / 16;
        double gal = pint / 8;
        return "Imperial:\nOunce: " + ounce + "\nPint" + pint + "\nGallon: " + gal;
    }

    @Override
    public String litre(double litre) {
        double ounce = (litre / 3785.41) / 1000;
        double pint = ounce / 16;
        double gal = pint / 8;
        return "Imperial:\nOunce: " + ounce + "\nPint" + pint + "\nGallon: " + gal;
    }

    @Override
    public String kiloLitre(double kl) {
        double ounce = kl * 33814;
        double pint = ounce / 16;
        double gal = pint / 8;
        return "Imperial:\nOunce: " + ounce + "\nPint" + pint + "\nGallon: " + gal;
    }

    // Mass:

    @Override
    public String ounce(double ounce) {
        Double mg = ounce * 28.3495;
        Double g = mg / 1000;
        Double kg = g / 1000;
        return "Metric:\nMiligrams: " + mg + "\nGrams" + g + "\nKilograms: " + kg;
    }

    @Override
    public String pound(double pound) {
        Double mg = pound * 453592;
        Double g = mg / 1000;
        Double kg = g / 1000;
        return "Metric:\nMiligrams: " + mg + "\nGrams" + g + "\nKilograms: " + kg;
    }

    @Override
    public String stone(double stone) {

        Double kg = stone * 6.35029;
        Double mg = kg * 1000000;
        Double g = mg / 1000;
        return "Metric:\nMiligrams: " + mg + "\nGrams" + g + "\nKilograms: " + kg;
    }

    @Override
    public String miligrams(double ml) {
        Double pound = ml * 0.0022;
        Double stone = pound / 14;
        Double ounce = pound * 16;
        return "Imperial:\nounces: " + ounce + "\nStone: " + stone + "\nPounds: " + pound;
    }

    @Override
    public String grams(double g) {
        Double pound = g / 454;
        Double stone = pound / 14;

        Double ounce = pound * 16;
        return "Imperial:\nounces: " + ounce + "\nStone: " + stone + "\nPounds: " + pound;
    }

    @Override
    public String kiloGrams(double kg) {
        Double pound = kg * 2.20462;
        Double stone = pound / 14;

        Double ounce = pound * 16;
        return "Imperial:\nounces: " + ounce + "\nStone: " + stone + "\nPounds: " + pound;
    }

    // Area:
    @Override
    public String squareFoot(double sf) {
        double hectare = sf / 107639;
        double squareMetre = hectare * 10000;
        double squareKm = hectare / 100;

        return "Imperial:\sSquareMetre: " + squareMetre + "\nHectare: " + hectare + "\nSquare Kilometre: " + squareKm;
    }

    @Override
    public String rood(double rood) {
        double hectare = rood * 0.1011714106;
        double squareMetre = hectare * 10000;
        double squareKm = hectare / 100;

        return "Imperial:\sSquareMetre: " + squareMetre + "\nHectare: " + hectare + "\nSquare Kilometre: " + squareKm;
    }

    @Override
    public String acre(double acre) {
        double hectare = acre / 2.471;
        double squareMetre = hectare * 10000;
        double squareKm = hectare / 100;

        return "Imperial:\sSquareMetre: " + squareMetre + "\nHectare: " + hectare + "\nSquare Kilometre: " + squareKm;
    }

    @Override
    public String hectare(double hectare) {
        double sf = hectare * 107639;
        double rood = sf / 10890;
        double acre = rood * 0.25;

        return "Metric:\sSquareFeet: " + sf + "\nRood: " + rood + "\nAcre: " + acre;
    }

    @Override
    public String squareMetre(double sm) {
        double sf = sm * 10.764;
        double rood = sf / 10890;
        double acre = rood * 0.25;

        return "Metric:\sSquareFeet: " + sf + "\nRood: " + rood + "\nAcre: " + acre;
    }

    @Override
    public String squareKilometre(double sk) {
        double acre = sk * 247.105;
        double sf = acre * 43560;
        double rood = sf / 10890;

        return "Metric:\sSquareFeet: " + sf + "\nRood: " + rood + "\nAcre: " + acre;
    }

}
