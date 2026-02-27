public class Preco {

    public double calcularPrecoFinal(double precoBase) {

        double imposto = precoBase * 0.2;
        double taxaFixa = 10;
        double desconto = precoBase * 0.05;

        return precoBase + imposto + taxaFixa - desconto;
    }
}