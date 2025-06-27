import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        System.out.println("Setting up before test...");
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        mathUtils = null;
    }

    @Test
    public void testMultiply() {

        int result = mathUtils.multiply(3, 4);

        assertEquals(12, result);
    }

    @Test
    public void testDivide() {

        int result = mathUtils.divide(10, 2);

        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        mathUtils.divide(10, 0);
    }
}