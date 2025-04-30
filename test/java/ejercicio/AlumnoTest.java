package ejercicio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    void getNombre() {
        Alumno alumno = new Alumno("María", 19, "mariaru@correo.com");
        assertEquals("María", alumno.getNombre());
    }

    @Test
    void setNombre() {
        Alumno alumno = new Alumno();
        alumno.setNombre("Pedro");
        assertEquals("Pedro", alumno.getNombre());
    }

    @Test
    void getEdad() {
        Alumno alumno = new Alumno("Cristina", 21, "cristina@correo.com");
        assertEquals(21, alumno.getEdad());
    }

    @Test
    void setEdad() {
        Alumno alumno = new Alumno();
        alumno.setEdad(22);
        assertEquals(22, alumno.getEdad());
    }

    @Test
    void getCorreo() {
        Alumno alumno = new Alumno("Pedro", 20, "pedro@correo.com");
        assertEquals("pedro@correo.com", alumno.getCorreo());
    }

    @Test
    void setCorreo() {
        Alumno alumno = new Alumno();
        alumno.setCorreo("juan@correo.com");
        assertEquals("juan@correo.com", alumno.getCorreo());
    }

    @Test
    void testToString() {
        Alumno alumno = new Alumno("Cristina", 21, "cristina@correo.com");
        String expectedString = "Alumno[nombre:Cristina, edad:21, correo:cristina@correo.com]";
        assertEquals(expectedString, alumno.toString());

    }
}