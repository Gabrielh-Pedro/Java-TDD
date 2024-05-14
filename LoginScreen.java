/**
 * Classe responsável por autenticar usuários.
 */
public class LoginScreen {
    
    /**
     * Método para autenticar um usuário.
     * 
     * @param usuario O nome de usuário.
     * @param senha A senha do usuário.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
    public boolean autenticar(String usuario, String senha) {
        // Verificar se o usuário e a senha correspondem aos valores esperados
        if (usuario.equals("usuario") && senha.equals("senha")) {
            return true; // Usuário autenticado com sucesso
        } else {
            return false; // Autenticação falhou
        }
    }
}
