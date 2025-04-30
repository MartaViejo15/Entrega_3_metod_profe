package ejercicio1.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainEmployeeTest {

    @Test
    void main() {
        String fichero = "empleado.json";

        String[] args = {"hola", fichero};
        MainEmployee.main(args);

        String[] argShowNoFile = {"show", "fichero.json"};
        MainEmployee.main(argShowNoFile);

        String[] argInit = {"init", fichero};
        MainEmployee.main(argInit);

        String[] argShowFile = {"show", fichero};
        MainEmployee.main(argShowFile);

        String[] argInitNoFile = {"init", "b://2"};
        assertThrows(java.io.IOException.class, () -> MainEmployee.main(argInitNoFile));
    }
}