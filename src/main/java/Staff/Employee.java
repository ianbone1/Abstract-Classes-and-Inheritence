package Staff;

public class Employee {

    private String name;
    private String nationalInsurance;
    private double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNationalInsurance() {
        return this.nationalInsurance;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double payRise){
        if (payRise >0) {
            this.salary += payRise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
