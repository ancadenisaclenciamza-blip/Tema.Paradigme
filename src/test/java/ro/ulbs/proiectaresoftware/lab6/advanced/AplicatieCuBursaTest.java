package test.java.ro.ulbs.proiectaresoftware.lab6.advanced;

import lab2.AplicatieCuBursa;
import lab2.StudentBursier;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AplicatieCuBursaTest {

    @Test
    public void testSorteaza() {
        AplicatieCuBursa app = new AplicatieCuBursa();
        List<StudentBursier> lista = app.genereaza();

        app.sorteaza(lista);
        assertNotNull(lista);
        assertTrue(lista.size() > 0);
        assertEquals("Mihalcea", lista.get(0).getNume());
    }
}