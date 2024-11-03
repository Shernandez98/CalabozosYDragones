package Datos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaballeroTest {
    Personaje personaje;

    @Before
    public void setUp() throws Exception {
        personaje = new Caballero(new Hacha());
    }

    @Test
    public void testGetNombre() {
        String obtenido = personaje.getNombre();
        assertEquals("Caballero",obtenido);
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
       assertEquals(3,obtenido);
    }

    @Test
    public void testArmaActual() {
        String obtenido = personaje.getArmaActual().getNombre();
        assertEquals("Hacha", obtenido);
    }

    @Test
    public void testPoderTotal() {
        int obtenido = personaje.getPoderTotal();
        assertEquals(11,obtenido);
    }

    @Test
    public void testCambiarArma() {
        personaje = new Caballero(new Espada());
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