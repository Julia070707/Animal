package L17.animal.tests;

import L17.animal.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    void testEquals() {
        Cat cat1 = new Cat("Whiskers", "Gray");
        Cat cat2 = new Cat("Whiskers", "Gray");

        assertTrue(cat1.equals(cat2));
    }

    @Test
    void testHashCode() {
        Cat cat1 = new Cat("Whiskers", "Gray");
        Cat cat2 = new Cat("Whiskers", "Gray");

        assertEquals(cat1.hashCode(), cat2.hashCode());
    }
}
