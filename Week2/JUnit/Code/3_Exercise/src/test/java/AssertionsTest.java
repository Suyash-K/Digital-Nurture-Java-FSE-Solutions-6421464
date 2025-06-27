import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void basicAssertions() {
        // equals
        assertEquals("Sum should be 7", 7, 3 + 4);

        // true
        assertTrue("5 > 2 must be true", 5 > 2);

        // false
        assertFalse("2 > 5 must be false", 2 > 5);

        // null
        Object nothing = null;
        assertNull("Object should be null", nothing);

        // not null
        Object obj = new Object();
        assertNotNull("Object should not be null", obj);
    }
}
