package ejercicio1.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date fecha = new Date(16, 8,2025);
        fecha.getDay();
    }

    @Test
    void getMonth() {
        Date fecha = new Date(16, 8,2025);
        fecha.getMonth();
    }

    @Test
    void getYear() {
        Date fecha = new Date(16, 8,2025);
        fecha.getYear();
    }

    @Test
    void setDay() {
        Date fecha = new Date(16, 8,2025);
        fecha.setDay(20);
    }

    @Test
    void setMonth() {
        Date fecha = new Date(16, 8,2025);
        fecha.setMonth(12);
    }

    @Test
    void setYear() {
        Date fecha = new Date(16, 8,2025);
        fecha.setYear(1942);
    }

    @Test
    void setDate() {
        Date fecha = new Date(16, 8,2025);
        fecha.setDate(12,1,1937);
    }

    @Test
    void testToString() {
        Date fecha = new Date(16, 8,2025);
        fecha.toString();
    }
}