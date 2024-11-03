package Datos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuchilloTest {
    Arma arma;

    @Before
    public void setUp() throws Exception {
        arma  = new Cuchillo();
    }

    @Test
    public void testGetPoder(){
        int obtenido = arma.getPoder();
        assertEquals(6,obtenido);
    }

    @Test
    public void testGetNombre(){
        String obtenido = arma.getNombre();
        assertEquals("Cuchillo",obtenido);
    }

    @Test
    public void testUsar() {
        arma.usar();
    }
}