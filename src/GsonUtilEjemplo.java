import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* El modificador static permite indicar a metodos, variables o clases que son de una clase
   en si misma y no dependen de la instancia de la clase. Esto permite poder llamar a los
   metodos sin tener que crear un objeto de la clase. EN EL CONSTRUCTOR no haria falta usar
   el modificador static, ya que el constructor es lo que tenemos que instanciar.

*/
public class GsonUtilEjemplo {
    // Metodo para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Metodo para cargar un objeto desde un archivo JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
// Crear una instancia del objeto Usuario
        Usuario usuario = new Usuario("Juan", 30, "juan@example.com");
// Ruta del archivo donde se guardará el objeto
        String rutaArchivo = "usuario.json";
// Guardar el objeto Usuario en un archivo JSON
        guardarObjetoEnArchivo(rutaArchivo, usuario);
// Cargar el objeto Usuario desde el archivo JSON
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        } else{
            System.out.println("Usuario nulo");
        }
    }
    // Clase Usuario para los ejemplos
    static class Usuario {
        String nombre;
        int edad;
        String correo;
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
// Getters y setters no incluidos por brevedad
    }
}

/* El fichero de datos en el que se guarda, es el que indicamos como rutaArchivo de tipo String,
   ya que con el metodo FileWriter crea un archivo con el nombre que hemos indicado en rutaArchivo
   y en ese fichero se guardan los datos del usuario.
*/