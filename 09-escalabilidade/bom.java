public interface UsuarioStrategy {
    void executar();
}

public class AdminStrategy implements UsuarioStrategy {
    public void executar() {
        System.out.println("Ações de administrador");
    }
}