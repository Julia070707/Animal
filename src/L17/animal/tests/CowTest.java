package L17.animal.tests;

import L17.animal.Cow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CowTest {

    @Test
    void testEquals() {
        Cow cow1 = new Cow("Bessie", 5);
        Cow cow2 = new Cow("Bessie", 5);

        assertTrue(cow1.equals(cow2));
    }

    @Test
    void testHashCode() {
        Cow cow1 = new Cow("Bessie", 5);
        Cow cow2 = new Cow("Bessie", 5);

        assertEquals(cow1.hashCode(), cow2.hashCode());
    }
}
