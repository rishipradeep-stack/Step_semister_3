package main.java.week6.assignment_problems;

public class CompanyRecord {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public CompanyRecord(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        CompanyRecord e1 = new CompanyRecord("Divya", 65000);
        CompanyRecord e2 = new CompanyRecord("Arjun", 40000);
        CompanyRecord e3 = new CompanyRecord("Rohan", 55000);

        CompanyRecord.printCompanyInfo();
    }
}