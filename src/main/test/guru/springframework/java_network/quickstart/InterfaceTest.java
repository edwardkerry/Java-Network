package guru.springframework.java_network.quickstart;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class InterfaceTest {

    Interface javaNet = new Interface();

    @Test
    public void testOpeningStatement() throws Exception {
        String message = "Hello, World\n";
        assertEquals(message, javaNet.openingStatement());
    }
}
