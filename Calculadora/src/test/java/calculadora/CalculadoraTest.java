package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void testSoma() {
        assertEquals(9, calc.somar(6, 3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(-1, calc.subtrair(10, 11));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(10, calc.multiplicar(2, 5));
    }

    @Test
    public void testDivisao() {
        assertNotEquals(2, calc.dividir(10, 5));
    }

    @Test
    public void testRaizQuadrada() {
        assertNotEquals(5, calc.raizQuadrada(25));
    }

    @Test
    public void testPotencia() {
        assertNotEquals(4, calc.potencia(2, 2));
    }

}
