package ejercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainAlumnoTest {
    @Test
    void main() {
        String FICHERO_TEST = "test_alumnos.json";

        String[] argsInit = {"init", FICHERO_TEST};
        MainAlumno.main(argsInit);

        File fichero = new File(FICHERO_TEST);
        Assertions.assertTrue(fichero.exists());

        String[] argsShow = {"show", FICHERO_TEST};
        MainAlumno.main(argsShow);

        String[] argsInvalido = {"otra", FICHERO_TEST};
        MainAlumno.main(argsInvalido);

        String[] argsInvalido2 = {FICHERO_TEST};
        MainAlumno.main(argsInvalido2);

        String[] argsShowVacío = {"show", "fichero_inexistente.json"};
        MainAlumno.main(argsShowVacío);
    }

    @Test
    void guardarAlumnosEnArchivo() {
        String FICHERO_TEST = "test_alumnos.json";
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("María", 19, "mariaru@correo.com"));
        alumnos.add(new Alumno("Pedro", 20, "pedro@correo.com"));
        alumnos.add(new Alumno("Cristina", 21, "cristina@correo.com"));

        MainAlumno.guardarAlumnosEnArchivo(FICHERO_TEST, alumnos);

        File fichero = new File(FICHERO_TEST);
        Assertions.assertTrue(fichero.exists());
    }

    @Test
    void cargarAlumnosDesdeArchivo() {
        String FICHERO_TEST = "test_alumnos.json";
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("María", 19, "mariaru@correo.com"));
        alumnos.add(new Alumno("Pedro", 20, "pedro@correo.com"));
        alumnos.add(new Alumno("Cristina", 21, "cristina@correo.com"));

        MainAlumno.guardarAlumnosEnArchivo(FICHERO_TEST, alumnos);

        List<Alumno> alumnosCargados = MainAlumno.cargarAlumnosDesdeArchivo(FICHERO_TEST);

        assertNotNull(alumnosCargados);
        assertEquals(3, alumnosCargados.size());
        assertEquals("María", alumnosCargados.get(0).getNombre());
    }
    @Test
    void guardarAlumnosEnArchivoInvalido() {
        String FICHERO_TEST_INVALIDO = "/carpeta_que_no_existe/test.json";
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Lucía", 22, "lucia@correo.com"));

        MainAlumno.guardarAlumnosEnArchivo(FICHERO_TEST_INVALIDO, alumnos);

        File fichero = new File(FICHERO_TEST_INVALIDO);
        assertFalse(fichero.exists());
    }
}