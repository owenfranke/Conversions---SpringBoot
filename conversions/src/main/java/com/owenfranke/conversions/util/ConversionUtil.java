//Owen Franke
//Abstract Utility Layer

package com.owenfranke.conversions.util;

public interface ConversionUtil {
    // Temperature:
    public String celsius(double input);

    public String farenheit(double input);

    // Lengths:
    public String centimetre(double input);

    public String inche(double input);

    public String foot(double input);

    public String mile(double input);

    public String kilometre(double input);

    public String metre(double input);

    // Volumes:
    public String fluidOunce(double input);

    public String pint(double input);

    public String gallon(double input);

    public String mililitre(double input);

    public String litre(double input);

    public String kiloLitre(double input);

    // Mass:
    public String ounce(double input);

    public String pound(double input);

    public String stone(double input);

    public String miligrams(double input);

    public String grams(double input);

    public String kiloGrams(double input);

    // Area:
    public String squareFoot(double input);

    public String rood(double input);

    public String acre(double input);

    public String hectare(double input);

    public String squareMetre(double input);

    public String squareKilometre(double input);
}
