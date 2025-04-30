package ejercicio1.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.getId();

    }

    @Test
    void getFirstName() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.getFirstName();
    }

    @Test
    void getLastName() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.getLastName();
    }

    @Test
    void getName() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.getName();
    }

    @Test
    void getSalary() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.getSalary();
    }

    @Test
    void setSalary() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.setSalary(1200);
    }

    @Test
    void getAnnualSalary() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.getAnnualSalary();
    }

    @Test
    void raiseSalary() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.raiseSalary(25);
    }

    @Test
    void testToString() {
        Employee empleado = new Employee(1,"Robert", "Susanu", 1500);
        empleado.toString();
    }
}