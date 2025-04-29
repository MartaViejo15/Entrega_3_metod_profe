import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GsonUtilEjemploTest {

    GsonUtilEjemplo.Usuario usuario = new GsonUtilEjemplo.Usuario("Juan", 32, "Juan@gmail.com");

    @Test
    void guardarObjetoEnArchivo() {
        assertThrows(java.io.IOException.class, () -> GsonUtilEjemplo.guardarObjetoEnArchivo("2",usuario));
        assertDoesNotThrow(() -> GsonUtilEjemplo.guardarObjetoEnArchivo("usuario.json", usuario));
    }

    @Test
    void cargarObjetoDesdeArchivo() {
        assertThrows(java.io.IOException.class, () -> GsonUtilEjemplo.cargarObjetoDesdeArchivo("3", GsonUtilEjemplo.Usuario.class));
        assertDoesNotThrow(() -> GsonUtilEjemplo.cargarObjetoDesdeArchivo("usuario.json", GsonUtilEjemplo.Usuario.class));
    }

    @Test
    void main() {
        GsonUtilEjemplo.main(null);
    }
}