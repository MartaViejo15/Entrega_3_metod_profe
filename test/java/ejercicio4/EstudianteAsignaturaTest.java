package ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class EstudianteAsignaturaTest {

    @Test
    void main() {
        assertDoesNotThrow(()->EstudianteAsignatura.main(new String[0]));
    }

    @Test
    void guardar() {
        Asignatura asignatura = new Asignatura();
        asignatura.estudiantes[0] = new Estudiante();
        assertDoesNotThrow(()->EstudianteAsignatura.guardar("Asignatura 1.json", asignatura));
        assertDoesNotThrow(()->EstudianteAsignatura.guardar("b:\\Asignatura 1.json", asignatura));
    }

    @Test
    void mostrar() {
        assertDoesNotThrow(()->EstudianteAsignatura.mostrar("Asignatura 1.json",Asignatura.class));
        assertDoesNotThrow(()->EstudianteAsignatura.mostrar("Asignatura 2.json",Asignatura.class));
    }
}