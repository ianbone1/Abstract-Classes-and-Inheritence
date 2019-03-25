import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer devGirl;

    @Before
    public void setup(){
        devGirl = new Developer("Lucy", "NI223344K", 30000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Lucy", devGirl.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("NI223344K", devGirl.getNationalInsurance());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, devGirl.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300, devGirl.payBonus(),0);
    }

    @Test
    public void canGivePayRise() {
        devGirl.raiseSalary(devGirl.payBonus());
        assertEquals(30300.0, devGirl.getSalary(), 0);
    }

    @Test
    public void canConfirmNoNegativePayRise() {
        devGirl.raiseSalary(-1000);
        assertEquals(30000, devGirl.getSalary(),0);
    }

    @Test
    public void canChangeName() {
        devGirl.setName("Lucky Lucy");
        assertEquals("Lucky Lucy", devGirl.getName());
    }

    @Test
    public void canNotSetNullName() {
        devGirl.setName(null);
        assertEquals("Lucy", devGirl.getName());
    }
}
