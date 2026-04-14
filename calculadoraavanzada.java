package CalculadoraJava;

public class calculadoraavanzada {


    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: división por cero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        calculadoraavanzada calc = new calculadoraavanzada();

        System.out.println("Multiplicación: " + calc.multiplicacion(10, 5));
        System.out.println("División: " + calc.division(10, 5));
    }
}
