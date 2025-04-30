import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class GsonLectura {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String rutaArchivo = "usuario.json";

        try (FileReader reader = new FileReader(rutaArchivo)) {
            Usuario usuarioCargado = gson.fromJson(reader, Usuario.class);
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Clase Usuario
    static class Usuario {
        String nombre;
        int edad;
        String correo;

        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }
}
