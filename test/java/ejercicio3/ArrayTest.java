package ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ArrayTest {

    @Test
    void main() {
        assertDoesNotThrow(()->Array.main(new String[0]));
    }

    @Test
    void guardar() {
        String[] array = new String[3];
        array[0] = "Hello";
        array[1] = "World";
        assertDoesNotThrow(()->Array.guardar("b:\\array.json", array));
        assertDoesNotThrow(()->Array.guardar("array.json", array));
    }
}