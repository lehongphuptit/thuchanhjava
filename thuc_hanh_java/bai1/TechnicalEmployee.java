package bai1;

public class TechnicalEmployee extends Employee {
    private int workingHours;
    private double hourlyWage;

    public TechnicalEmployee(String name, int age, int workingHours, double hourlyWage) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyWage;
    }
}