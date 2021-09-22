package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class JUnitTest {
    public static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void demo() {
        Assert.assertTrue(true);
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }
}
