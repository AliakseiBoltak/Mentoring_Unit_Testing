package junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Date;

import static org.hamcrest.CoreMatchers.containsString;

public class JunitCalBugsTest extends JunitBaseTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void multipleBug() throws InterruptedException { // rounds the result to the down value : return Math.floor(a * b);
        Thread.sleep(1000);
        System.out.println("Junit Time is: " + new Date(System.currentTimeMillis()));
        double result = calculator.mult(2.2, 5.5);
        System.out.println("Actual result is: " + result);
        System.out.println("Expected result is: " + 2.2*5.5);
        Assert.assertTrue(result == 12.1);
    }

    @Test
    public void powBug() throws InterruptedException { //rounds down 'b' value : return Math.pow(a, Math.floor(b));
        Thread.sleep(1000);
        System.out.println("Junit Time is: " + new Date(System.currentTimeMillis()));
        double result = calculator.pow(2.2, 5.5);
        System.out.println("Actual result is: " + result);
        System.out.println("Expected result is: " + 76.4407156829);
        Assert.assertTrue(result == 76.4407156829);
    }

    @Test
    public void sqrtBug() throws InterruptedException { //does not throw exception if 'a' value is less then '0d' : return Math.sqrt(Math.abs(a));
        Thread.sleep(1000);
        System.out.println("Junit Time is: " + new Date(System.currentTimeMillis()));
        exception.expect(ArithmeticException.class);
        exception.expectMessage(containsString("negative"));
        double result = calculator.sqrt(-5);
        System.out.println("Actual result is: " + result);
        System.out.println("Expected result is: Exception should be thrown");
    }

    @Test
    public void ctgBug() throws InterruptedException { //returns tangent of 'a' as the result : return Math.tanh(a);
        Thread.sleep(1000);
        System.out.println("Junit Time is: " + new Date(System.currentTimeMillis()));
        double result = calculator.ctg(-5.0);
        System.out.println("Actual result is: " + result);
        System.out.println("Expected result is: " + 1/Math.tan(-5.0));
        Assert.assertTrue(result == Math.cos(-5.0));
    }

    @Test
    public void cosBug() throws InterruptedException { //returns sinus of 'a' as the result : return Math.sin(a);
        Thread.sleep(1000);
        System.out.println("Junit Time is: " + new Date(System.currentTimeMillis()));
        double result = calculator.cos(-5.0);
        System.out.println("Actual result is: " + result);
        System.out.println("Expected result is: " + Math.cos(-5.0));
        Assert.assertTrue(result == Math.cos(-5.0));
    }

}
