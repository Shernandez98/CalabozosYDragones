package Datos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReyTest {
    Personaje personaje;

    @Before
    public void setUp() throws Exception {
        personaje = new Rey(new Hacha());
    }

    @Test
    public void testGetNombre() {
        String obtenido = personaje.getNombre();
        assertEquals("Rey",obtenido);
    }

    @Test
    public void testSetNombre() {
        personaje.setNombre("Diego y Selvin");
        String obtenido = personaje.getNombre();
        assertEquals("Diego y Selvin",obtenido);
    }

    @Test
    public void testPoderBase() {
       int obtenido = personaje.getPoderBase();
       assertEquals(5,obtenido);
    }

    @Test
    public void testArmaActual() {
        String obtenido = personaje.getArmaActual().getNombre();
        assertEquals("Hacha", obtenido);
    }

    @Test
    public void testPoderTotal() {
        int obtenido = personaje.getPoderTotal();
        assertEquals(13,obtenido);
    }

    @Test
    public void testCambiarArma() {
        personaje = new Rey(new Espada());
        personaje.cambiarArma(new Cuchillo());
        String obtenido = personaje.getArmaActual().getNombre();
        assertEquals("Cuchillo", obtenido);
    }

    @Test
    public void testAtacar() {
        personaje.atacar();
    }

    @Test
    public void testDisplay() {
        personaje.display();
    }
}