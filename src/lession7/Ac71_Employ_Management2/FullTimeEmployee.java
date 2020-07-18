package lession7.Ac71_Employ_Management2;

public class FullTimeEmployee extends Employee{
    private int TotalWorkingDays; // tổng số ngày lv
    private long DailySalary; // lương theo ngày

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(int totalWorkingDays, long dailySalary) {
        TotalWorkingDays = totalWorkingDays;
        DailySalary = dailySalary;
    }

    public FullTimeEmployee(String name, int age, String identificationNumber, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNumber);
        TotalWorkingDays = totalWorkingDays;
        DailySalary = dailySalary;
    }

    @Override
    public long getMealAllowance() {
        return 2000000;
    }

    @Override
    public long getSalaryRate() {
        return DailySalary;
    }

    @Override
    public int getWorkingCount() {
        return TotalWorkingDays;
    }

    @Override
    public long CalculateSalary() {
        return getWorkingCount() * getSalaryRate() + getMealAllowance();
    }

    @Override
    public String toString() {
        return super.toString() + "FullTimeEmployee{" +
                "TotalWorkingDays=" + TotalWorkingDays +
                ", DailySalary=" + DailySalary +
                ", Salary= " + CalculateSalary() +
                '}';
    }
}
