import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BeautifulArrayTest {
    @Test
    public void example1() {
        BeautifulArray solution = new BeautifulArray();
        ArrayList<Integer> result = solution.beautifulArray(4);
        ArrayList<Integer> numbEx1 = new ArrayList<>();
        numbEx1.add(2);
        numbEx1.add(1);
        numbEx1.add(4);
        numbEx1.add(3);
        Assert.assertEquals(numbEx1,result);
    }


}
