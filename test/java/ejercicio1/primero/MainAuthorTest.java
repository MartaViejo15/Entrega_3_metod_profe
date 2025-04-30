package ejercicio1.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainAuthorTest {

    @Test
    void main() {
        String fichero = "autor.json";

        String[] args = {"hola", fichero};
        MainAuthor.main(args);

        String[] argShowNoFile = {"show", "fichero.json"};
        MainAuthor.main(argShowNoFile);

        String[] argInit = {"init", fichero};
        MainAuthor.main(argInit);

        String[] argShowFile = {"show", fichero};
        MainAuthor.main(argShowFile);

        String[] argInitNoFile = {"init", "b://2"};
        assertThrows(java.io.IOException.class, () -> MainAuthor.main(argInitNoFile));
    }
}