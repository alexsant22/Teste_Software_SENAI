package calculadora;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return (double) a / b;
    }
    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de número negativo");
        }
        return Math.sqrt(numero);
    }
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
