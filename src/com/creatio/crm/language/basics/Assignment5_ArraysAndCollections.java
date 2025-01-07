package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_ArraysAndCollections {

	public static void main(String[] args) {
		
		/*
		 * Create a list of the top 5 most populated countries in the world and print 2nd Country
		 * Top 5 countries are : India, China, United States, Indonesia, and Pakistan
		 */

		//Creating the list for top 5 populated countries using List Collection
		
		List<String> populatedCountries=new LinkedList<String>();
		populatedCountries.add("India");
		populatedCountries.add("China");
		populatedCountries.add("United States");
		populatedCountries.add("Indonesia");
		populatedCountries.add("Pakistan");
		
		System.out.println("1 ===================list of the top 5 most populated countries in the world====================");
		// Printing the 2nd most populated Country from the above created list
		System.out.println("The 2nd most populated contry in the world is : "+populatedCountries.get(1));
		System.out.println();
		
		/*
		 * Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		 * Top most visited tourist places are : Forbidden city,Eiffel tower,Taj Mahal,Empire state building,statue of liberty,Northern Lights,stone henge
		 * Burj Khalifa, Palace of Versailles,St.Peter's Basillica
		 */
		System.out.println("2 ===================top 10 most visited tourist attractions in the world====================/n");
		//Creating the set of top 10 most visited tourist attractions in the world using set collections
		Set<String> mostVisitedTourist=new LinkedHashSet<String>();
		mostVisitedTourist.add("Forbidden City");
		mostVisitedTourist.add("Eiffel Tower");
		mostVisitedTourist.add("Taj Mahal");
		mostVisitedTourist.add("Empire State Building");
		mostVisitedTourist.add("Statue Of Liberty");
		mostVisitedTourist.add("Northern Lights");
		mostVisitedTourist.add("Stone Henge");
		mostVisitedTourist.add("Burj Khalifa");
		mostVisitedTourist.add("Palace Of Versailles");
		mostVisitedTourist.add("St. Peter's Basillica");
		System.out.println();
		//Printing the set of most visited Tourist places
		System.out.println("The Most visited top 10 tourist arraction places are : "+mostVisitedTourist);
		System.out.println();
		//Printing the size of top most tourist places
		System.out.println("The size of set of top most tourist attraction place is : "+mostVisitedTourist.size());
		System.out.println();
		
		/*
		 * Create a map of the 5 largest cities in the United States and their populations
		 * % largest cities in US with populations are:
		 * New York City: 8,804,190
		 * Los Angeles: 3,898,747
		 * Chicago: 2,746,388
		 * Houston: 2,304,580
		 * Phoenix: 1,608,139
		 */
		System.out.println("3 ===================the 5 largest cities in the United States and their populations====================");
		//Creating the map list for 5 largest cities in US along with population using MAP key value pair concept
		Map<String,String> largestCities=new HashMap<String,String>();
		largestCities.put("NewYorkCity", "8,804,190");
		largestCities.put("LosAngels", "3,898,747");
		largestCities.put("Chicago", "2,746,388");
		largestCities.put("Houston", "2,304,580");
		largestCities.put("Phoenix", "1,608,139");
		//Printing the list of cities with population in the Map all at once
		System.out.println("the 5 Largest US cities are : "+largestCities);
		//Priting the cities and population 1 by 1
		System.out.println("New York City : "+largestCities.get("NewYorkCity"));
		System.out.println("LosAngels : "+largestCities.get("LosAngels"));
		System.out.println("Chicago : "+largestCities.get("Chicago"));
		System.out.println("Houston : "+largestCities.get("Houston"));
		System.out.println("Phoenix : "+largestCities.get("Phoenix"));
		System.out.println();
		
		/*
		 * Create an array of 10 random integers and print out the sum of 3rd and 5th Value
		 */
		System.out.println("4 ===================the 5 largest cities in the United States and their populations====================");
		//Creating the array
		int[] randomNumbers= {3,5,7,1,9,8,2,4,6,58};
		int sumOfArrayValues=randomNumbers[2]+randomNumbers[4];
		System.out.println("Sum of 3rd and 5th array value is : "+randomNumbers[2]+"+"+randomNumbers[4]+" = "+sumOfArrayValues);
		//Creating array and adding values 
		int[] randomNum=new int[10];
		randomNum[0]=23;
		randomNum[1]=55;
		randomNum[2]=78;
		randomNum[3]=96;
		randomNum[4]=41;
		randomNum[5]=26;
		randomNum[7]=8;
		randomNum[8]=19;
		randomNum[9]=95;
		int sumOfArrayValues1=randomNum[2]+randomNum[4];
		System.out.println();
		System.out.println("Initialize and Add : Sum of 3rd and 5th array value is : "+randomNum[2]+"+"+randomNum[4]+" = "+sumOfArrayValues1);
		System.out.println();
		
		/*
		 * Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list
		 * top 5 highest-grossing movies are:
		 * Enthiran
		 * Bigil
		 * Sarkar
		 * PonniyinSelvan1
		 * PonniyinSelvan2
		 */
		System.out.println("5 ===================top 5 highest-grossing movies of all time====================");
		//Creating the list
		List<String> highestGrossingMoviesTamil=new ArrayList<String>();
		highestGrossingMoviesTamil.add("Enthiran");
		highestGrossingMoviesTamil.add("Bigil");
		highestGrossingMoviesTamil.add("Sarkar");
		highestGrossingMoviesTamil.add("PonniyinSelvan1");
		highestGrossingMoviesTamil.add("PonniyinSelvan2");
		//Printing the list of all movies
		System.out.println("List of movies having highest grossing all the time : "+highestGrossingMoviesTamil);
		System.out.println();
		//Printing the 3rd movie in the list
		System.out.println("The 3rd movie in the high grossing list : "+highestGrossingMoviesTamil.get(2));
		
		
	}

}
