package guru.springframework.java_network.quickstart;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class InterfaceTest {

    Interface javaNet = new Interface();

    @Test
    public void testOpeningStatement() throws Exception {
        String message = "You are standing in a social network\n";
        assertEquals(message, javaNet.openingStatement());
    }

//    @Test
//    public void testNewUser() throws Exception {
//        String name="Spike"
//
//        javaNet.createNewUser(name);
//

}
