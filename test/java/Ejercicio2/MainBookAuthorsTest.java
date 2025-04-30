package Ejercicio2;

import ejercicio1.primero.MainAuthor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainBookAuthorsTest {

    @Test
    void main() {
        String fichero = "libroConAutores.json";

        String[] args = {"hola", fichero};
        MainBookAuthors.main(args);

        String[] argShowNoFile = {"show", "fichero.json"};
        MainBookAuthors.main(argShowNoFile);

        String[] argInit = {"init", fichero};
        MainBookAuthors.main(argInit);

        String[] argShowFile = {"show", fichero};
        MainBookAuthors.main(argShowFile);

        String[] argInitNoFile = {"init", "b://2"};
        assertDoesNotThrow(() -> MainBookAuthors.main(argInitNoFile));
    }
}