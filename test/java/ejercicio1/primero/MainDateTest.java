package ejercicio1.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainDateTest {

    @Test
    void main() {
        String fichero = "fecha.json";

        String[] args = {"hola", fichero};
        MainDate.main(args);

        String[] argShowNoFile = {"show", "fichero.json"};
        MainDate.main(argShowNoFile);

        String[] argInit = {"init", fichero};
        MainDate.main(argInit);

        String[] argShowFile = {"show", fichero};
        MainDate.main(argShowFile);

        String[] argInitNoFile = {"init", "b://2"};
        assertThrows(java.io.IOException.class, () -> MainDate.main(argInitNoFile));
    }
}