package Staff.Management.Director;

import Staff.Management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsurance, double salary, String deptName, double budget) {
        super(name, nationalInsurance, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return this.getSalary() * 0.02;
    }
}
