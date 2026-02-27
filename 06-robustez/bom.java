public class Calculadora {
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}