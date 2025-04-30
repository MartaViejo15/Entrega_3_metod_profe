package ejercicio1.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AuthorTest {

    @Test
    void getName() {
        Author autor = new Author("Pepe", "Pepe@gmail.com", 'm');
        autor.getName();
    }

    @Test
    void setName() {
        Author autor = new Author("Pepe", "Pepe@gmail.com", 'm');
        autor.setName("Juan");
    }

    @Test
    void getEmail() {
        Author autor = new Author("Pepe", "Pepe@gmail.com", 'm');
        autor.getEmail();
    }

    @Test
    void setEmail() {
        Author autor = new Author("Pepe", "Pepe@gmail.com", 'm');
        autor.setEmail("Juan@gmail.com");
    }

    @Test
    void getGender() {
        Author autor = new Author("Pepe", "Pepe@gmail.com", 'm');
        autor.getGender();
    }

    @Test
    void setGender() {
        Author autor = new Author("Pepe", "Pepe@gmail.com", 'm');
        autor.setGender('f');
    }

    @Test
    void testToString() {
        Author autor = new Author("Pepe", "Pepe@gmail.com", 'm');
        autor.toString();
    }
}