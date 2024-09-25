package JavaTasks2;
//Write a Java program to create a class called "Employee" with a name,
//job title, and salary attributes, and methods to calculate and update salary.
public class Employee {
	    
	    private String name;
	    private String jobTitle;
	    private double salary;

	    public Employee(String name, String jobTitle, double salary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	    }

	    public double calculateAnnualSalary() {
	        return salary * 12;
	    }

	    public void updateSalary(double newSalary) {
	        if (newSalary < 0) {
	            System.out.println("Salary cannot be negative.");
	        } else {
	            this.salary = newSalary;
	            System.out.println("Salary updated to: $" + salary);
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void displayEmployeeInfo() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Job Title: " + jobTitle);
	        System.out.println("Monthly Salary: $" + salary);
	        System.out.println("Annual Salary: $" + calculateAnnualSalary());
	    }

	    public static void main(String[] args) {
	        Employee emp = new Employee("Alice Smith", "Software Engineer", 5000);
	       
	        emp.displayEmployeeInfo();
	        
	   
	        emp.updateSalary(6000);
	        
	      
	        emp.displayEmployeeInfo();
	        
	    
	        emp.updateSalary(-2000);
	    }
	}



