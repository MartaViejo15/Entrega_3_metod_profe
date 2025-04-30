package Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        assertEquals(88, c1.getId());
    }

    @Test
    void getName() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        assertEquals("Tan Ah Teck", c1.getName());
    }

    @Test
    void getDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        assertEquals(10, c1.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        c1.setDiscount(15);
        assertEquals(15, c1.getDiscount());
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        assertEquals("Tan Ah Teck(88)(10%)", c1.toString());
    }
}