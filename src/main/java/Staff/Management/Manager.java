package Staff.Management;

public class Manager extends Staff.Employee{

    private String deptName;

    public Manager(String name, String nationalInsurance, double salary, String deptName) {
        super(name, nationalInsurance, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }



}
