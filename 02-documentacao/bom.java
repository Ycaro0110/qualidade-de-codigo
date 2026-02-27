/** Classe responsável pelo cálculo do IMC */
public class CalculadoraIMC {

    /**
     * @param peso Peso em kg
     * @param altura Altura em metros
     * @return Valor do IMC
     */
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }
}