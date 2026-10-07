package bai1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        
        employees[0] = new OfficeEmployee("Nguyễn Văn A", 25, 22);
        employees[1] = new TechnicalEmployee("Trần Thị B", 28, 160, 15.5);
        employees[2] = new OfficeEmployee("Lê Văn C", 30, 20);

        for (Employee emp : employees) {
            emp.printInfo();
        }
    }
}