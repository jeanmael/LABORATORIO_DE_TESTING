package tudelft.MCMD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MCMDCoverageTest {

    @Test
    public void pruebaCaso1() {
        MCMD mcmd = new MCMD();
        assertTrue(mcmd.evaluar(true, true, false));
    }

    @Test
    public void pruebaCaso2() {
        MCMD mcmd = new MCMD();
        assertFalse(mcmd.evaluar(false, true, false));
    }

    @Test
    public void pruebaCaso3() {
        MCMD mcmd = new MCMD();
        assertFalse(mcmd.evaluar(true, false, false));
    }

    @Test
    public void pruebaCaso4() {
        MCMD mcmd = new MCMD();
        assertTrue(mcmd.evaluar(false, false, true));
    }
}
