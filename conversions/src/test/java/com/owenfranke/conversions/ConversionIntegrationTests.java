package com.owenfranke.conversions;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//Integration Tests
//All layers are tested: Utility, Service and Controller.
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConversionsApplication.class)
@AutoConfigureMockMvc


public class ConversionIntegrationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    void testFromAcre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/area/acre/50");
        String expected = "Imperial:\nSquareMetre: 202347.23\nHectare: 20.23\nSquare Kilometre: 0.2";
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromCelsius() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/temperature/celsius/50");
        String expected = "In Farenheit: 122.0";
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromCm() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/length/centimetre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nInches: 19.69\nFeet: 1.64\nMiles: 0.0";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromFarenheit() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/temperature/farenheit/12");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "In Celsius: -11.0";
        assertEquals(expected, result.getResponse().getContentAsString());
    }
    @Test
    void testFromKilograms() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/mass/kilograms/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nOunces: 1763.7\nStone: 7.87\nPounds: 110.23";
        assertEquals(expected, result.getResponse().getContentAsString());
    }
    @Test
    void testFromFluidOunce() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/volume/ounce/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nMililiters: 1478.68\nLitres: 1.48\nKilolitres: 0.0";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromFoot() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/length/foot/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nCentimetre: 1524.0\nMetre: 15.24\nkilometre: 0.02";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromGallon() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/volume/gallon/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nMililiters: 189270.5\nLitres: 189.27\nKilolitres: 0.19";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromGrams() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/mass/grams/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nOunces: 1.76\nStone: 0.01\nPounds: 0.11";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromHectare() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/area/hectare/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nSquareFeet: 5381950.0\nRood: 494.21\nAcre: 123.55";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromInches() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/length/inch/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nCentimetre: 127.0\nMetre: 1.27\nkilometre: 0.0";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromKilolitre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/volume/kilolitre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nOunce: 1690700.0\nPint: 105668.75\nGallon: 13208.59";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromKm() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/length/kilometre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nInches: 1968500.0\nFeet: 164050.0\nMiles: 31.08";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromLitre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/volume/litre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nOunce: 1690.7\nPint: 105.67\nGallon: 13.21";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromMetre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/length/metre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nInches: 1968.5\nFeet: 164.05\nMiles: 0.03";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromMile() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/length/mile/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nCentimetre: 8046720.0\nMetre: 80467.0\nkilometre: 80.45";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromMiligrams() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/mass/miligrams/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nOunces: 1.76\nStone: 0.01\nPounds: 0.11";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromMililitre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/volume/mililitre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nOunce: 0.01\nPint: 0.0\nGallon: 0.0";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromOunce() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/mass/ounce/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nMiligrams: 1417.48\nGrams: 1.42\nKilograms: 0.0";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromPint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/volume/pint/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nMililiters: 23658.5\nLitres: 23.66\nKilolitres: 0.02";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromPound() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/mass/pound/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nMiligrams: 2.26796E7\nGrams: 22679.6\nKilograms: 22.68";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromRood() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/area/rood/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nSquareMetre: 50585.71\nHectare: 5.06\nSquare Kilometre: 0.05";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromSF() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/area/squarefoot/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Imperial:\nSquareMetre: 4.65\nHectare: 0.0\nSquare Kilometre: 0.0";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromSM() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/area/squaremetre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nSquareFeet: 538.2\nRood: 0.05\nAcre: 0.01";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromSquareKilometer() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/area/squarekilometre/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nSquareFeet: 5.3819469E8\nRood: 49421.0\nAcre: 12355.25";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    void testFromStone() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/mass/stone/50");
        MvcResult result = mvc.perform(request).andReturn();
        String expected = "Metric:\nMiligrams: 3.175145E8\nGrams: 317514.5\nKilograms: 317.51";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

}
