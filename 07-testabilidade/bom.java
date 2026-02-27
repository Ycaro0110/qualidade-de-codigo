public interface UsuarioRepository {
    void salvar(String usuario);
}

public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(String usuario) {
        repository.salvar(usuario);
    }
}