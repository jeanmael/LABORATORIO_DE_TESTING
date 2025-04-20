package tudelft.Autenticador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tudelft.Autenticador.Autenticador;

import static org.junit.jupiter.api.Assertions.*;

class AutenticadorTest {

    Autenticador auth = new Autenticador();

    @Test
    public void testUsuarioNull() {
        assertFalse(auth.autenticar(null, "1234"));
    }

    @Test
    public void testPasswordNull() {
        assertFalse(auth.autenticar("admin", null));
    }

    @Test
    public void testPasswordMuyCorto() {
        assertFalse(auth.autenticar("admin", "123"));
    }

    @Test
    public void testUsuarioNoPermitido() {
        assertFalse(auth.autenticar("noexiste", "1234"));
    }

    @Test
    public void testPasswordIncorrecto() {
        assertFalse(auth.autenticar("admin", "5678"));
    }

    @Test
    public void testUsuarioAdminCorrecto() {
        assertTrue(auth.autenticar("admin", "1234"));
    }

    @Test
    public void testUsuarioUsuarioCorrecto() {
        assertTrue(auth.autenticar("usuario", "1234"));
    }

    @Test
    public void testUsuarioInvitadoCorrecto() {
        assertTrue(auth.autenticar("invitado", "1234"));
    }
}