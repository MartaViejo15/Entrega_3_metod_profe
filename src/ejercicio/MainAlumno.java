package ejercicio;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainAlumno {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<args.length;i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);
        /*
        Sale en pantalla: "Argumentos:" que se corresponde con el vacío.

        Al escribir Hola Mundo Cruel cada una de las palabras se mete como un argumento
        nuevo, mientras que al ponerlo en una String, "Hola Mundo Cruel", todas las
        palabras se meten a un único argumento. Esto ocurre porque al añadir las comillas,
        la terminal lo detecta como un único argumento, y al no llevar comillas cada palabra
        es un argumento distinto.
         */

        if (args.length != 2) {
            return;
        }

        String operacion = args[0];
        String fichero = args[1];

        if (operacion.equals("init")) {

            List<Alumno> alumnos = new ArrayList<>();
            alumnos.add(new Alumno("María", 19, "mariaru@correo.com"));
            alumnos.add(new Alumno("Pedro", 20, "pedro@correo.com"));
            alumnos.add(new Alumno("Cristina", 21, "cristina@correo.com"));

            guardarAlumnosEnArchivo(fichero, alumnos);

        } else if (operacion.equals("show")) {
            List<Alumno> alumnos = cargarAlumnosDesdeArchivo(fichero);

            if (alumnos != null) {
                for (Alumno alumno : alumnos) {
                    System.out.println(alumno);
                }
            } else {
                System.out.println("No se encontró al alumno");
            }
        } else {
            System.out.println("Operación no valida");
        }
    }

    // Método para guardar un objeto en un archivo JSON
    public static <T> void guardarAlumnosEnArchivo(String fichero, List<Alumno> alumnos){
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(fichero)) {
            gson.toJson(alumnos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar un objeto desde un archivo JSON
    public static List<Alumno> cargarAlumnosDesdeArchivo(String fichero){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fichero)) {
            Alumno[] alumnosArray = gson.fromJson(reader, Alumno[].class);
            return Arrays.asList(alumnosArray);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
