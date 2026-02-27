public class Usuario {

    public void executar(String tipo) {
        if (tipo.equals("ADMIN")) {
            System.out.println("Admin");
        } else if (tipo.equals("USER")) {
            System.out.println("User");
        }
    }
}