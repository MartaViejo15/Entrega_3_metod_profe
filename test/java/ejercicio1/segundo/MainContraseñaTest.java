package ejercicio1.segundo;

import ejercicio1.primero.MainEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainContraseñaTest {

    @Test
    void main() {String fichero = "contraseña.json";

        String[] args = {"hola", fichero};
        MainContraseña.main(args);

        String[] argShowNoFile = {"show", "fichero.json"};
        MainContraseña.main(argShowNoFile);

        String[] argInit = {"init", fichero};
        MainContraseña.main(argInit);

        String[] argShowFile = {"show", fichero};
        MainContraseña.main(argShowFile);

        String[] argInitNoFile = {"init", "b://2"};
        assertThrows(java.io.IOException.class, () -> MainContraseña.main(argInitNoFile));
    }
}