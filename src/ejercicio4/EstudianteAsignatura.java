package ejercicio4;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EstudianteAsignatura {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura();
        asignatura.estudiantes[0] = new Estudiante();
        guardar("Asignatura 1.json", asignatura);
        System.out.println(mostrar("Asignatura 1.json", Asignatura.class).estudiantes[0].nombre);
    }

    public static <T> void guardar(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static <T> T mostrar(String ruta, Class<T> clase){
        Gson gson = new Gson();
        try(FileReader fr = new FileReader(ruta)){
            return gson.fromJson(fr,clase);
        }catch (IOException e){
            System.out.println(e);
            return null;
        }
    }
}
/*El fichero resultante tiene estructura de {"nombre":"Mate","estudiantes":[{"nombre":"Juan","curso":"Java"},null,null]},
donde estan los atributos nombre y estudiantes(con estructura de array, y dentro de ella,
la estructura de un estudiante(con sus atributos nombre y curso)).
Puedo modificar los alumnos del fichero resultante, pero no puedo obtener otros objetos que no sea lo estructurado.
 */