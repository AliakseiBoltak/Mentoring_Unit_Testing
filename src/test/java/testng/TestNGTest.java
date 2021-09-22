package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTest {

    public Calculator calculator;

    @BeforeClass
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void demo() {
		Assert.assertFalse(false);
	}

	@AfterClass
	public void tearDown() {
		calculator = null;
	}
}
