package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    private ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0));
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100));
        assertEquals(-40.0, conversor.celsiusParaFahrenheit(-40));
        assertEquals(98.6, conversor.celsiusParaFahrenheit(37), 0.1);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32));
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212));
        assertEquals(-40.0, conversor.fahrenheitParaCelsius(-40));
        assertEquals(37.0, conversor.fahrenheitParaCelsius(98.6), 0.1);
    }

    @Test
    public void testCelsiusParaKelvin() {
        assertEquals(273.15, conversor.celsiusParaKelvin(0));
        assertEquals(373.15, conversor.celsiusParaKelvin(100));
        assertEquals(0.0, conversor.celsiusParaKelvin(-273.15));
    }

    @Test
    public void testCelsiusParaKelvinInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> conversor.celsiusParaKelvin(-274));
        assertEquals("Temperatura abaixo do zero absoluto!", exception.getMessage());
    }

    @Test
    public void testKelvinParaCelsius() {
        assertEquals(0.0, conversor.kelvinParaCelsius(273.15));
        assertEquals(100.0, conversor.kelvinParaCelsius(373.15));
        assertEquals(-273.15, conversor.kelvinParaCelsius(0));
    }

    @Test
    public void testKelvinParaCelsiusInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> conversor.kelvinParaCelsius(-1));
        assertEquals("Kelvin não pode ser negativo!", exception.getMessage());
    }

    @Test
    public void testConversaoCircularCelsiusFahrenheit() {
        double celsiusOriginal = 25.5;
        double fahrenheit = conversor.celsiusParaFahrenheit(celsiusOriginal);
        double celsiusConvertido = conversor.fahrenheitParaCelsius(fahrenheit);
        assertEquals(celsiusOriginal, celsiusConvertido, 0.001);
    }

    @Test
    public void testConversaoCircularCelsiusKelvin() {
        double celsiusOriginal = 30.0;
        double kelvin = conversor.celsiusParaKelvin(celsiusOriginal);
        double celsiusDeKelvin = conversor.kelvinParaCelsius(kelvin);
        assertEquals(celsiusOriginal, celsiusDeKelvin, 0.001);
    }
}