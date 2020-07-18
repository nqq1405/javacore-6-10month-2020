package lession7.Ac71_Employ_Management2;

public class PartTimeEmployee extends Employee {
    private int TotalWorkingShift; // tổng số ca làm việc
    private long baseSalary; // lương theo ca lv

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int totalWorkingShift, long baseSalary) {
        TotalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public PartTimeEmployee(String name, int age, String identificationNumber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNumber);
        TotalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMealAllowance() {
        return 0;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return TotalWorkingShift;
    }

    @Override
    public long CalculateSalary() {
        return getSalaryRate() * getWorkingCount() + getMealAllowance();
    }

    @Override
    public String toString() {
        return super.toString() + "PartTimeEmployee{" +
                "TotalWorkingShift=" + TotalWorkingShift +
                ", baseSalary=" + baseSalary +
                ", Salary= " + CalculateSalary() +
                '}';
    }
}
