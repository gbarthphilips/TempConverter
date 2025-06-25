package org.example;

import org.example.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32.0, App.celsiusParaFahrenheit(0), 0.01);
        assertEquals(212.0, App.celsiusParaFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0.0, App.fahrenheitParaCelsius(32), 0.01);
        assertEquals(100.0, App.fahrenheitParaCelsius(212), 0.01);
    }
}
