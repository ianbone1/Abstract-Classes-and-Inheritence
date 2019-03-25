import Staff.Management.Director.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    public Director director;

    @Before
    public void setup(){
        director = new Director("Side Show Bob", "NI67423K", 30000, "Developers", 30000);
    }

    @Test
    public void canGetName() {
        assertEquals("Side Show Bob", director.getName());
    }

    @Test
    public void canGetbudget() {
        assertEquals(30000, director.getBudget(),0);
    }

    @Test
    public void canGetPayrise() {
        assertEquals(600.0, director.payBonus(),0);
    }

    @Test
    public void canGivePayRise() {
        director.raiseSalary(director.payBonus());
        assertEquals(30600.0, director.getSalary(), 0);
    }
}
