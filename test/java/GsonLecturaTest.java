import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GsonLecturaTest {
    final String archivo = "usuario.json";

    @Test
    void main() {
        String valido = "{\"nombre\":\"Laura\",\"edad\":28,\"correo\":\"laura@correo.com\"}";
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write(valido);
        } catch (IOException e) {
            throw new RuntimeException("No se puede crear el archivo", e);
        }
        GsonLectura.main(new String[]{});
    }

    @Test
    void archivoInexistente() {
        File file = new File(archivo);
        if (file.exists()) file.delete();

        GsonLectura.main(new String[]{});
    }

    @Test
    void Usuario() {
        GsonLectura.Usuario usuario = new GsonLectura.Usuario("Luis", 40, "luis@correo.com");
        assertEquals("Luis", usuario.nombre);
        assertEquals(40, usuario.edad);
        assertEquals("luis@correo.com", usuario.correo);
    }
}