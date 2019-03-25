import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffManagerTest {


    public Manager manager;

    @Before
    public void setup(){
        manager=new Manager("Bob","NY126633Z",25000.0,"Developers");
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("NY126633Z", manager.getNationalInsurance());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000.0, manager.getSalary(),0);
    }

    @Test
    public void canGetDept() {
        assertEquals("Developers", manager.getDeptName());
    }

    @Test
    public void canGetPayrise() {
        assertEquals(250.0, manager.payBonus(),0);
    }

    @Test
    public void canGivePayRise() {
        manager.raiseSalary(manager.payBonus());
        assertEquals(25250.0, manager.getSalary(), 0);
    }
}
