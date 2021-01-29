package example.junit4;

import org.junit.Assert;
import org.junit.Test;

public class RerunFeatureTest {

    @Test
    public void testToPass() {
        System.out.println("Running passed test...");
        Assert.assertTrue(true);
    }

    @Test
    public void testFlaky() {
        long num = Math.round(Math.random());
        System.out.println("num = " + num);
        Assert.assertEquals(num, 1);
    }

    @Test
    public void testToFail() {
        System.out.println("Running failed test...");
        Assert.fail("Please rerun me with Intellij!");
    }
}
