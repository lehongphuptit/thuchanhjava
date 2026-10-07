package bai1;

public abstract class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double calculateSalary();
    
    public void printInfo() {
        System.out.println("Tên: " + name + " | Tuổi: " + age + " | Lương: " + calculateSalary());
    }
}
