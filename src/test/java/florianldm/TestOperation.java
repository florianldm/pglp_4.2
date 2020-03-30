package florianldm;

import org.junit.Assert;
import org.junit.Test;

public class TestOperation {

    private static double a;

    @Test
    public void testPlus() {
        a = Operation.PLUS.eval(1, 5);
        Assert.assertEquals(6, a, 0.0);
    }

    @Test
    public void testMult() {
        a = Operation.MULT.eval(2, 5);
        Assert.assertEquals(10, a, 0.0);
    }
    @Test
    public void testDiv() {
        a = Operation.DIV.eval(2, 10);
        Assert.assertEquals(5, a, 0.0);
    }

    @Test
    public void testMoins() {
        a = Operation.MOINS.eval(5, 30);
        Assert.assertEquals(25, a, 0.0);
    }
}
