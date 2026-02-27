import java.util.List;

public class Busca {
    public boolean buscarNumero(List<Integer> lista, int numero) {
        for (Integer n : lista) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }
}