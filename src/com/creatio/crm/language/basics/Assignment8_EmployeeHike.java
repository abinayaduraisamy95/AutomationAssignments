package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment8_EmployeeHike {

	public static void main(String[] args) {
		/*
		 * There are 5 Employee records. Now Calculate the Hike percentage of each
		 * Employee and store the Values in Map with EmployeeName and
		 * HikePercentagevalue and Print them.
		 * 
		 * Hike = ( Base Salary * variable pay % ) + Bonus+Reward ; Hike % = Hike / Base
		 * Salary .
		 */

		// Creating variable for storing employee name details using Array
		String[] empName = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };
		// Creating variable for storing employee Base Salary details using Array
		double[] baseSalary = { 75000, 68000, 82000, 90000, 60000 };
		// Creating variable for storing employee year of Experience details using Array
		int[] yearsOfExperience = { 5, 3, 7, 10, 2 };
		// Creating variable for storing employee year End Rating Out of 5 details using
		// Array
		double[] yearEndRating = { 4.2, 3.8, 4.5, 2, 3.5 };

		// Creating variable to store the employee name and hike percentage of employee
		// using Map Collection
		Map<String, Double> empHikePercentage = new HashMap<String, Double>();
		// Initializing array for storing Hike Percentage
		double[] hikePercentage = new double[empName.length];
		// Using for loop to iterate all the em[ployee details for hike calculation
		for (int i = 0; i < empName.length; i++) {
			// initializing the variable to store the hike value of each employee
			double[] hike = new double[empName.length];
			// initializing the variable to store Variable pay percentage and bonus as per
			// the year end rating
			int variablePay, bonus = 0;
			// initializing the variable to store reward of employees as per the experience
			int reward = 0;
			// condition to check the rating >4||>=3 and <4 || <3
			if (yearEndRating[i] >= 4) {
				variablePay = 15;
				bonus = 1500;
			} else if ((yearEndRating[i] >= 3) && (yearEndRating[i] < 4)) {
				variablePay = 10;
				bonus = 1200;
			} else {
				variablePay = 3;
				bonus = 300;
			}
			// Condition to add reward amount for the employee as per the experience
			if (yearsOfExperience[i] >= 5) {
				reward = 5000;
				// calculating the hike value with using formula of Hike = ( Base Salary *
				// variable pay % ) + Bonus+Reward ;
				hike[i] = (baseSalary[i] * variablePay) + bonus + reward;
				// calculating hike percentage using formula of Hike % = Hike / Base Salary
				hikePercentage[i] = hike[i] / baseSalary[i];
			} else {
				reward = 0;
				// calculating the hike value with using formula of Hike = ( Base Salary *
				// variable pay % ) + Bonus+Reward ;
				hike[i] = (baseSalary[i] * variablePay) + bonus + reward;
				// calculating hike percentage using formula of Hike % = Hike / Base Salary
				hikePercentage[i] = hike[i] / baseSalary[i];
			}

		}
		//for loop to store the employee name and hike percentage calculated
		for (int j = 0; j < empName.length; j++) {
			empHikePercentage.put(empName[j], hikePercentage[j]);
		}
		//Using for each loop to print the list of employees with their name and Hike Percentage
		for (Map.Entry<String, Double> hikePercent : empHikePercentage.entrySet()) {

			System.out.println(
					" Hike Percentage for the Employee :" + hikePercent.getKey() + " is : " + hikePercent.getValue());
		}
	}

}
