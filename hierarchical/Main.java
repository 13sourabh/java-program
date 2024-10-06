package com.hierarchical;

public class Main {

	public static void main(String[] args) {
	
		 // Create Employee object
        Employee emp = new Employee("Sourabh", 101, "Indore", 50000);
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        // Create Student object
        Student stu = new Student("Sourabh", 202, "Vidisha", "MCA");
        System.out.println("\nStudent Details:");
        stu.displayStudentDetails();
	}

}
