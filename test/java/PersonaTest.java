import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonaTest {
    Persona persona = new Persona("Pepe",1);

    @Test
    void getNombre() {
        assertEquals("Pepe", persona.getNombre());
    }

    @Test
    void setNombre() {
        persona.setNombre("P");
        assertEquals("P", persona.getNombre());
    }

    @Test
    void getEdad() {
        assertEquals(1,persona.getEdad());
    }

    @Test
    void setEdad() {
        persona.setEdad(10);
        assertEquals(10,persona.getEdad());
    }
}