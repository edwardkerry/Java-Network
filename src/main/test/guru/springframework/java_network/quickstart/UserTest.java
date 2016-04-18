package guru.springframework.java_network.quickstart;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;


public class UserTest {

    User spike = new User("Spike");

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Test
    public void testUserName() throws Exception {
        String name = "Spike";
        assertEquals(name, spike.name);
    }

    @Test public void testPostMessage() throws Exception {
        String message = "This is a message";
        spike.post(message);
        assertEquals(spike.messages.get(0), message);
    }

    @Test public void testViewMessages() throws Exception {
        String message1 = "message1";
        String message2 = "message2";
        spike.post(message1);
        spike.post(message2);
        assertEquals("message1\nmessage2", outContent.toString());
    }



}