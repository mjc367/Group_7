import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player mango = new Player("Joseph");
    Player armada = new Player("Adam");
    Player zero = new Player("Gonzalo");
    Player axe = new Player("Jeffery");


    @org.junit.Test
    public void getName() throws Exception {
        assertEquals("Joseph", mango.getName());
        mango.setName("Joey");
        assertEquals("Joey", mango.getName());
    }

    @Test
    public void getTag() throws Exception {
        armada.setTag("Armada");
        assertEquals("Armada", armada.getTag());
    }

    @org.junit.Test
    public void getID() throws Exception {
        axe.setID(18236);
        assertEquals(18236, axe.getID());
    }

    @org.junit.Test
    public void getRank() throws Exception {
        zero.setRank(1);
        assertEquals(1, zero.getRank());
    }

    @org.junit.Test
    public void getSponsor() throws Exception {
        mango.setSponsor("C9");
        assertEquals("C9", mango.getSponsor());

    }

}