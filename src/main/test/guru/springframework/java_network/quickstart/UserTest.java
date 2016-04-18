package guru.springframework.java_network.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;


public class UserTest {

    User spike = new User("Spike");

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



}