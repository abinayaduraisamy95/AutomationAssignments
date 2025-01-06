package com.creatio.crm.language.basics;

import java.sql.Time;

public class Assignments1_DataTypes {

	public static void main(String[] args) {
		/**
		 * This class file having the different types of data types in java
		 */
		// 1.Temperature of a city in degrees Celsius: 25.5
		float cityInDegreeCelsius = 25.5f;
		System.out.println("Temperature of a city in degrees Celsius: " + cityInDegreeCelsius);

		// 2.Whether a customer has placed an order: true or false
		boolean hasPlacedOrder = true;
		System.out.println("Whether a customer has placed an order: " + hasPlacedOrder);

		// 3.Person's phone number: "123-456-7890"
		long phoneNumber = 1234567890l;
		System.out.println("Person's phone number: " + phoneNumber);
		String strPhoneNumber = "123-456-7890";
		System.out.println("Person's phone number: \"" + strPhoneNumber + "\"");

		// 4.Amount of money in a customer's bank account: 1000.50
		float customerBankAccount = 1000.50f;
		System.out.println("Amount of money in a customer's bank account: " + customerBankAccount);

		// 5.Person's email address: "john.doe@example.com"
		String emailaddress = "john.doe@example.com";
		System.out.println("Person's email address: \"" + emailaddress + "\"");

		// 6.Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double locationLatitude = 37.7749;
		double locationLongitude = -122.4194;
		System.out.println(
				"Coordinates of a location (latitude, longitude): " + locationLatitude + ", " + locationLongitude);

		// 7.Person's marital status: true or false
		boolean maritalStatus = false;
		System.out.println("Person's marital status: " + maritalStatus);

		// 8.Person's occupation: "Software Engineer"
		String personOccupation = "Software Engineer";
		System.out.println("Person's occupation: \"" + personOccupation + "\"");

		// 9.Person's favourite colour: "Blue"
		String favColour = "Blue";
		System.out.println("Person's favourite colour: \"" + favColour + "\"");

		// 10.Current year: 2023
		int currentYear = 2023;
		System.out.println("Current year: " + currentYear);

		// 11.Number of followers on a social media platform: 1,000,000
		int noOfFollowers = 1000000;
		System.out.println("Number of followers on a social media platform: " + noOfFollowers);
		String strNoOfFollowers = "1,000,000";
		System.out.println("Number of followers on a social media platform: " + strNoOfFollowers);

		// 12.Rating of a movie: 7.5
		float movieRating = 7.5f;
		System.out.println("Rating of a movie: " + movieRating);

		// 13.Person's blood type: 'A'
		char bloodType = 'A';
		System.out.println("Person's blood type: \'" + bloodType + "\'");

		// 14.Title of a book: "To Kill a Mockingbird"
		String titleOfBook = "To Kill a Mockingbird";
		System.out.println("Title of a book: \"" + titleOfBook + "\"");

		// 15.Number of employees in a company: 500
		int noOfEmployees = 500;
		System.out.println("Number of employees in a company: " + noOfEmployees);

		// 16.Time of an event: 2:30 PM
		String timeOfEvent = "2:30 PM";
		System.out.println("Time of an event: " + timeOfEvent);

		// 17.Name of a country: "United States"
		String nameOfCountry = "United States";
		System.out.println("Name of a country: \"" + nameOfCountry + "\"");

		// 18.Person's eye color: "Brown"
		String eyeColor = "Brown";
		System.out.println("Person's eye color: \"" + eyeColor + "\"");

		// 19.Person's birthplace: "New York City"
		String birthPlace = "New York City";
		System.out.println("Person's birthplace: \"" + birthPlace + "\"");

		// 20.Distance between two cities: 200.5
		float distanceBetweenTwoCities = 200.5f;
		System.out.println("Distance between two cities: " + distanceBetweenTwoCities);

		System.out.println("-----Assignment 1 regarding Data types are done-----");
	}

}
