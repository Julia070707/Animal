package L17.animal.tests;

import L17.animal.Animal;
import L17.animal.Cat;
import L17.animal.Cow;
import L17.animal.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AnimalTest {

    @Test
    void testEquals() {
        Animal cat1 = new Cat("Fluffy", "White");
        Animal cat2 = new Cat("Fluffy", "White");
        Animal dog = new Dog("Buddy", "Labrador");

        assertEquals(cat1, cat2);
        assertNotEquals(cat1, dog);
    }

    @Test
    void testHashCode() {
        Animal cat1 = new Cat("Fluffy", "White");
        Animal cat2 = new Cat("Fluffy", "White");
        Animal dog = new Dog("Buddy", "Labrador");

        assertEquals(cat1.hashCode(), cat2.hashCode());
        assertNotEquals(cat1.hashCode(), dog.hashCode());
    }
}


