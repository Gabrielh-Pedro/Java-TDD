import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest {
    
    @Test
    public void testAutenticacao() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.autenticar("usuario", "senha"));
    }
}


// ETAPA 1 - Falhou. pois o método autenticar não existe, assim como o LoginScreen, e indicando que o pacote do Junit não existe.