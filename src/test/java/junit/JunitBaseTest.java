package junit;

import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class JunitBaseTest {
    public static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }
}
