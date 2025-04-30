package Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorsTest {

    @Test
    void getName() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 8);
        BookAuthors javaDummy2 = new BookAuthors("Java for Dummy", authors, 19.99);
        javaDummy.getName();
    }

    @Test
    void getAuthors() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertArrayEquals(authors, javaDummy.getAuthors());
    }

    @Test
    void getPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals(19.99, javaDummy.getPrice());
    }

    @Test
    void setPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        javaDummy.setPrice(28);
        assertEquals(28, javaDummy.getPrice());
    }

    @Test
    void getQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals(99, javaDummy.getQty());
    }

    @Test
    void setQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        javaDummy.setQty(99);
        assertEquals(99, javaDummy.getQty());
    }

    @Test
    void testToString() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        //assertEquals("Author[name=Tan Ah Teck, email=AhTeck@somewhere.com, gender=m]", authors[0].toString());
        //assertEquals("Author[name=Paul Tan, email=Paul@nowhere.com, gender=m]", authors[1].toString());
        assertEquals("Book [name=Java for Dummy,Authors: Tan Ah Teck, AhTeck@somewhere.com, mPaul Tan, Paul@nowhere.com, m, price=19.99, qty=99]", javaDummy.toString());
    }

    @Test
    void getAuthorNames() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals("Authors: Tan Ah Teck, Paul Tan, ", javaDummy.getAuthorNames());
    }

    @Test
    void getAuthorInfo() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals("Authors: Tan Ah Teck, AhTeck@somewhere.com, mPaul Tan, Paul@nowhere.com, m", javaDummy.getAuthorInfo());
    }

    @Test
    void getAuthorEmail() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals("Authors: AhTeck@somewhere.com, Paul@nowhere.com, ", javaDummy.getAuthorEmail());
    }

    @Test
    void getAuthorGender() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals("Authors: m, m, ", javaDummy.getAuthorGender());
    }
}