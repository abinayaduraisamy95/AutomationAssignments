package com.creatio.crm.language.basics;

public class EmpGroups extends Employees {
	/*create another class called EmpGroups that contains two arrays to store the employee names and IDs.
	 * Retrieve the data from the Employees class, store it in these arrays,
	 * finally print each employee's name along with their corresponding ID.
	 * Example: Employee Name: Bharath, Employee ID: 1234
	 */

	public static void main(String[] args) {
	// Variable to store the employees name from employee class
	String[] employeeName = new String[3];

	// Variable to store the employees id from employee class
	int[] employeeids = new int[3];

	// creating object for employee class
	EmpGroups employeeObject = new EmpGroups();

	employeeName[0]=employeeObject.name1;
	employeeName[1]=employeeObject.name2;
	employeeName[2]=employeeObject.name3;

	employeeids[0]=employeeObject.id1;
	employeeids[1]=employeeObject.id2;
	employeeids[2]=employeeObject.id3;

	// print the arrays of employees name and ids
	System.out.println("Employee Name : "+employeeName[0]+" , "+"Employee ID : "+employeeids[0]);
	System.out.println("Employee Name : "+employeeName[1]+" , "+"Employee ID : "+employeeids[1]);
	System.out.println("Employee Name : "+employeeName[2]+" , "+"Employee ID : "+employeeids[2]);

}
}
