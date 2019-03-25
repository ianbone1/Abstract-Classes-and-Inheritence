import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

        DatabaseAdmin devGirl;

        @Before
        public void setup(){
            devGirl = new DatabaseAdmin("Lucy", "NI223344K", 30000.0);
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
    }



