package com.exemplo;

public class ConversorTemperatura {

    public double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public double celsiusParaKelvin(double c) {
        if (c < -273.15) {
            throw new IllegalArgumentException("Temperatura abaixo do zero absoluto!");
        }
        return c + 273.15;
    }

    public double kelvinParaCelsius(double k) {
        if (k < 0) {
            throw new IllegalArgumentException("Kelvin não pode ser negativo!");
        }
        return k - 273.15;
    }
}
