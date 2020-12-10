import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BeautifulArrayTest {
    @Test
    public void example1() {
        BeautifulArray solution = new BeautifulArray();
        ArrayList<Integer> result = solution.beautifulArray(4);
        boolean a = true;
        for (int i = 1; i < result.size() - 1; i++) {
            if (result.get(i) == (result.get(i - 1) + result.get(i + 1)) / 2) {
                a = false;
                System.out.println("Этот массив таксебе!");
            }
        }
        System.out.println("Это красивый массив!");
        Assert.assertTrue(a);
    }

    @Test
    public void example2() {
        BeautifulArray solution = new BeautifulArray();
        ArrayList<Integer> result = solution.beautifulArray(10);
        boolean a = true;
        for (int i = 1; i < result.size() - 1; i++) {
            if (result.get(i) == (result.get(i - 1) + result.get(i + 1)) / 2) {
                a = false;
                System.out.println("Этот массив таксебе!");
            }
        }
        System.out.println("Это красивый массив!");
        Assert.assertTrue(a);
    }
}

