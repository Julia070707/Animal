package L17.animal.tests;

import L17.animal.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    void testEquals() {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Buddy", "Labrador");

        assertTrue(dog1.equals(dog2));
    }

    @Test
    void testHashCode() {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Buddy", "Labrador");

        assertEquals(dog1.hashCode(), dog2.hashCode());
    }
}
