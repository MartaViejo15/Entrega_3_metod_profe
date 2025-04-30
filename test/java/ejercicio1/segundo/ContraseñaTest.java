package ejercicio1.segundo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContraseñaTest {

    @Test
    void contraseña() {
        assertThrows(ContraseñaExcepción.class, () -> Contraseña.contraseña("asdawsawd"));
        assertDoesNotThrow(() -> Contraseña.contraseña("9876matecompu"));
    }

    @Test
    void main() {
        assertDoesNotThrow(() -> Contraseña.main(null));
    }

    @Test
    void testToString() {
        Contraseña contra = new Contraseña("hola");
        contra.toString();
    }
}