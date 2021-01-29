package example.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RerunFeatureTest {

    @Test
    public void testToPass() {
        System.out.println("Running passed test...");
        Assertions.assertTrue(true);
    }

    @Test
    public void testFlaky() {
        long num = Math.round(Math.random());
        System.out.println("num = " + num);
        Assertions.assertEquals(num, 1);
    }

    @Test
    public void testToFail() {
        System.out.println("Running failed test...");
        Assertions.fail("Please rerun me with Intellij!");
    }
}
