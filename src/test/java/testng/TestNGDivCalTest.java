package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class TestNGDivCalTest extends TestNGBaseTest{

    @Test
    public void sub() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("TestNG Time is: " + new Date(System.currentTimeMillis()));
        long result = calculator.sub(2, 1);
        Assert.assertTrue(result == 1);
    }

    @Test
    public void mult() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("TestNG Time is: " + new Date(System.currentTimeMillis()));
        long result = calculator.mult(2, 1);
        Assert.assertTrue(result == 2);
    }

    @Test
    public void div() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("TestNG Time is: " + new Date(System.currentTimeMillis()));
        long result = calculator.div(2, 1);
        Assert.assertTrue(result == 2);
    }
}
