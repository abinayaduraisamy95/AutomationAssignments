package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	/*
	 * Inside this Excel There are 3 TestCases with each Testcase having 3 rows of
	 * data. Now, Create List<String, Map<String,String>> to store all the data and
	 * Print the data from Product details > Supplier Name > Office Depot from the
	 * Map<String, Map<String,String>>
	 */
	public static void main(String[] args) {

		/*
		 * Storing the Student details in MAP using Key value pair concept in
		 * collections Students are : John Doe, Jane Smith,Mike Brown
		 */

		// Storing student 1 details in map
		Map<String, String> student1Map = new HashMap<String, String>();
		student1Map.put("Name", "John Doe");
		student1Map.put("Age", "20");
		student1Map.put("Gender", "Male");
		student1Map.put("Roll Number", "S12345");
		student1Map.put("Grade", "A");
		student1Map.put("Major", "Computer Science");
		student1Map.put("GPA", "3.8");
		student1Map.put("Email", "john@example.com");
		student1Map.put("Contact Number", "9999997777");
		student1Map.put("Address", "123 Elm St");

		// Storing student 2 details in map
		Map<String, String> student2Map = new HashMap<String, String>();
		student2Map.put("Name", "Jane Smith");
		student2Map.put("Age", "21");
		student2Map.put("Gender", "Female");
		student2Map.put("Roll Number", "S12346");
		student2Map.put("Grade", "B");
		student2Map.put("Major", "Mathematics");
		student2Map.put("GPA", "3.5");
		student2Map.put("Email", "jane@example.com");
		student2Map.put("Contact Number", "9876665666");
		student2Map.put("Address", "456 Oak St");

		// Storing student 3 details in map
		Map<String, String> student3Map = new HashMap<String, String>();
		student3Map.put("Name", "Mike Brown");
		student3Map.put("Age", "22");
		student3Map.put("Gender", "Male");
		student3Map.put("Roll Number", "S12347");
		student3Map.put("Grade", "A");
		student3Map.put("Major", "Physics");
		student3Map.put("GPA", "3.9");
		student3Map.put("Email", "mike@exapmle.com");
		student3Map.put("Contact Number", "8787876546");
		student3Map.put("Address", "789 Pine St");

		/*
		 * Storing the employee details in key value pair format using MAP collections
		 * emp id's are : E001,E002,E003
		 */

		// Storing emp 1 E001 details
		Map<String, String> employee1Map = new HashMap<String, String>();
		employee1Map.put("Employee ID", "E001");
		employee1Map.put("Name", "Alice Green");
		employee1Map.put("Age", "30");
		employee1Map.put("Gender", "Female");
		employee1Map.put("Department", "Engineering");
		employee1Map.put("Position", "Software Engineer");
		employee1Map.put("Salary", "75,000");
		employee1Map.put("Email", "alice@example.com");
		employee1Map.put("Contact Number", "9876543213");

		// Storing emp 2 E002 details
		Map<String, String> employee2Map = new HashMap<String, String>();
		employee2Map.put("Employee ID", "E002");
		employee2Map.put("Name", "Bob Johnson");
		employee2Map.put("Age", "35");
		employee2Map.put("Gender", "Male");
		employee2Map.put("Department", "Marketing");
		employee2Map.put("Position", "Maketing Manager");
		employee2Map.put("Salary", "85,000");
		employee2Map.put("Email", "bob@example.com");
		employee2Map.put("Contact Number", "9876543214");

		// Storing emp 3 E003 details
		Map<String, String> employee3Map = new HashMap<String, String>();
		employee3Map.put("Employee ID", "E003");
		employee3Map.put("Name", "Carol White");
		employee3Map.put("Age", "28");
		employee3Map.put("Gender", "Female");
		employee3Map.put("Department", "Sales");
		employee3Map.put("Position", "Sales Executive");
		employee3Map.put("Salary", "65,000");
		employee3Map.put("Email", "carol@example.com");
		employee3Map.put("Contact Number", "9876543215");

		/*
		 * Storing the product details in key value pair concept using collections
		 * Product id's are : P001,P002,P003
		 */

		// Storing the Product detail - P001
		Map<String, String> product1Map = new HashMap<String, String>();
		product1Map.put("Product ID", "P001");
		product1Map.put("Name", "Laptop");
		product1Map.put("Category", "Electronic");
		product1Map.put("Price", "$1,200");
		product1Map.put("Stock Quantity", "50");
		product1Map.put("Supplier", "Tech Supplies");
		product1Map.put("Warranty", "2 years");
		product1Map.put("Rating", "4.5");
		product1Map.put("Manufacturing Date", "15-01-2023");
		product1Map.put("Expiry Date", "15-01-2025");

		// Storing the Product detail - P002
		Map<String, String> product2Map = new HashMap<String, String>();
		product2Map.put("Product ID", "P002");
		product2Map.put("Name", "Desk Chair");
		product2Map.put("Category", "Furniture");
		product2Map.put("Price", "$150");
		product2Map.put("Stock Quantity", "200");
		product2Map.put("Supplier", "Office Depot");
		product2Map.put("Warranty", "1 year");
		product2Map.put("Rating", "4");
		product2Map.put("Manufacturing Date", "10-02-2023");
		product2Map.put("Expiry Date", "N/A");

		// Storing the Product detail - P003
		Map<String, String> product3Map = new HashMap<String, String>();
		product3Map.put("Product ID", "P003");
		product3Map.put("Name", "Coffee Maker");
		product3Map.put("Category", "Kitchen");
		product3Map.put("Price", "$75");
		product3Map.put("Stock Quantity", "100");
		product3Map.put("Supplier", "KitchenWorld");
		product3Map.put("Warranty", "6 months");
		product3Map.put("Rating", "4.2");
		product3Map.put("Manufacturing Date", "20-03-2023");
		product3Map.put("Expiry Date", "20-03-2024");
		
		/*
		 * Initializing the List collections to combine Student/Employee/Products Map to List
		 */

		//adding Student Map to List
		List<Map<String,String>> studentList=new ArrayList<Map<String,String>>();
		studentList.add(student1Map);
		studentList.add(student2Map);
		studentList.add(student3Map);
		
		//Adding Employee Map to List
		List<Map<String,String>> employeeList=new ArrayList<Map<String,String>>();
		employeeList.add(employee1Map);
		employeeList.add(employee2Map);
		employeeList.add(employee3Map);
		
		//Adding Product Map to List
		List<Map<String,String>> productList=new ArrayList<Map<String,String>>();
		productList.add(product1Map);
		productList.add(product2Map);
		productList.add(product3Map);
		
		/*
		 * Initializing the 3 different List = Student List, Employee List and Product List in 1 Map as finalData
		 */
		
		//Creating the Map to combine all the three List
		Map<String,List<Map<String,String>>> finalData=new HashMap<String,List<Map<String,String>>>();
		finalData.put("StudentData", studentList);
		finalData.put("EmployeeData", employeeList);
		finalData.put("ProductData",productList);
		
		//Printing the details of supplier of P002 product id from product details
		System.out.println("======================Printing the details of supplier of P002 product id from product details=============");
		System.out.println("Supplier Details of Product P002 from Product details is  : "+finalData.get("ProductData").get(1).get("Supplier"));
		System.out.println();
		
		//Printing all the details of all employees
		System.out.println("=======================Printing all the details of all employees=====================");
		System.out.println("Details of Employees : "+finalData.get("EmployeeData"));
		System.out.println();
		
		//Printing the roll number details of all student  from Student data
		System.out.println("======================Printing the roll number details of all student  from Student data=========================");
		System.out.println("Name of the Student : "+finalData.get("StudentData").get(0).get("Name")+"\nRoll number of the student 1 is :"+finalData.get("StudentData").get(0).get("Roll Number"));
		System.out.println("Name of the Student : "+finalData.get("StudentData").get(1).get("Name")+"\nRoll number of the student 2 is :"+finalData.get("StudentData").get(1).get("Roll Number"));
		System.out.println("Name of the Student : "+finalData.get("StudentData").get(2).get("Name")+"\nRoll number of the student 3 is :"+finalData.get("StudentData").get(2).get("Roll Number"));
	}

}
