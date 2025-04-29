package ejercicio3;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Array {
    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "Hello";
        array[1] = "World";
        guardar("array.json", array);
        Elemento<String[]> objeto = new Elemento<>("Conejo",array);
        guardar("objeto.json", objeto);
    }
    public static <T> void guardar(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*El array se guarda de forma ["Hello","World",null], donde hay 3 posiciones (tamaño maximo).
El array dentro de un objeto se guarda de forma {"id":"Conejo","dato":["Hello","World",null]},
donde id y dato son los atributos del objeto, asi como el array.
 */