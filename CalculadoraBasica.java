package CalculadoraJava;
public class CalculadoraBasica {

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        CalculadoraBasica calc = new CalculadoraBasica();

        System.out.println("Suma: " + calc.suma(10, 5));
        System.out.println("Resta: " + calc.resta(10, 5));
    }
}
