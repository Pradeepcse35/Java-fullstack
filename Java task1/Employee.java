package com.index;

public class Employee {
     String name;
     double salary;
     double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void Bonus(String month) {
        switch (month.toLowerCase()) {
            case "september":
                this.bonus = salary * 0.10;
                break;
            case "june":
                this.bonus = salary * 0.05; 
                break;
            default:
                this.bonus = 0; 
                break;
        }
    }

    public void EmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Pradeep", 5000);
        Employee emp2 = new Employee("Nandha", 6000);

       
        emp1.Bonus("september");
        emp2.Bonus("June");


        System.out.println("Employee 1 Details:");
        emp1.EmployeeDetails();
        
        System.out.println("\nEmployee 2 Details:");
        emp2.EmployeeDetails() ;
}
}
