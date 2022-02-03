package com.owenfranke.conversions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//Integration Tests
//All layers are tested: Utility, Service and Controller.
@ExtendWith(SpringExtension.class)
@WebMvcTest(ConversionsApplication.class)
public class ConversionIntegrationTests {

    @Autowired
    private MockMvc mvc;
/*
    @Test
    void testFromAcre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/temperature/celsius/12");
        MvcResult result = mvc.perform(request).andReturn();
        String correct = "Imperial:\nInches: 3.937Feet: 0.32808398950131235Miles: 6.213727366498067E-5";
        assertEquals(correct, result.getResponse().getContentAsString());
    }

    @Test
    void testFromCelsius() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromCm() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/length/centimetre/10");
        MvcResult result = mvc.perform(request).andReturn();
        String correct = "Imperial:\nInches: 3.937Feet: "
                + "0.32808398950131235Miles: 6.213727366498067E-5";

        assertEquals(correct, result.getResponse().getContentAsString());
    }

    @Test
    void testFromFarenheit() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/temperature/farenheit/12");
        MvcResult result = mvc.perform(request).andReturn();

        // assertEquals("In Celsius: -11.0", result.getResponse().getContentAsString());
    }

    @Test
    void testFromFluidOunce() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromFoot() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromGallon() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromGrams() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromHectare() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromInches() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromKM() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromKilolitre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromKm() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromLitre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromMetre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromMile() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromMiligrams() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromMililitre() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromOunce() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromPint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromPound() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromRood() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromSF() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromSM() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromSquareKilometer() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }

    @Test
    void testFromStone() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(result, " ");
    }
    */
}
