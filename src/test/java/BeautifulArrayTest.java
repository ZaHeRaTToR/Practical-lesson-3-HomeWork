import org.junit.Assert;
import org.junit.Test;

public class BeautifulArrayTest {
    @Test
    public void example1() {
        BeautifulArray solution = new BeautifulArray();
        boolean result = solution.isPowerOfFour(16);
        Assert.assertTrue(result);
    }

    @Test
    public void example2() {
        PowerOfFourSolution solution = new PowerOfFourSolution();
        boolean result = solution.isPowerOfFour(5);
        Assert.assertFalse(result);
    }

}
