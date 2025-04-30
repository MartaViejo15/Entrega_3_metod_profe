package Ejercicio2;

import ejercicio1.primero.MainAuthor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainInvoiceTest {

    @Test
    void main() {
        String fichero = "recibo.json";

        String[] args = {"hola", fichero};
        MainInvoice.main(args);

        String[] argShowNoFile = {"show", "fichero.json"};
        MainInvoice.main(argShowNoFile);

        String[] argInit = {"init", fichero};
        MainInvoice.main(argInit);

        String[] argShowFile = {"show", fichero};
        MainInvoice.main(argShowFile);

        String[] argInitNoFile = {"init", "b://2"};
        assertDoesNotThrow(() -> MainInvoice.main(argInitNoFile));
    }
}