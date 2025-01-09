package com.creatio.crm.language.basics;

import java.util.LinkedList;
import java.util.List;

public class Assignment9_GroceryList {
	/*
	 * Create methods called groceryList, addItem, removeItem, and viewList that allow the user to
add items to the list, remove items from the list, and view the current items in the list,
respectively.
	 */
	//Creating static variable used throughout the class
	static List<String> listOfGrocery = new LinkedList<>();
	static int listSize=0;
//Method for grocery list
	public void groceryList() {
		listOfGrocery.add("Vegetables");
		listOfGrocery.add("Fruits");
		listOfGrocery.add("Greens");
		listOfGrocery.add("Spices");
		listOfGrocery.add("Masalas");
		listSize=listOfGrocery.size();
		System.out.println("The size of item in the list : "+listSize);
	}
//Method for adding the item to the list
	public void addItem(String additem) {

		listOfGrocery.add(additem);
		System.out.println("Item Added to the grocery list : "+additem);
		listSize=listOfGrocery.size();
		System.out.println("The size of item in the list after add : "+listSize);
	}
//Method to remove item from the list
	public void removeItem(String removeitem) {
		listOfGrocery.remove(removeitem);
		System.out.println("Item Removed from the list is : "+removeitem);
		listSize=listOfGrocery.size();
		System.out.println("The size of item in the list after removal: "+listSize);
	}
//Method to view the list of grocery
	public void viewList() {
		System.out.println("List of Items available in the list after add/Remove : " + listOfGrocery);
		listSize=listOfGrocery.size();
		System.out.println("The size of item in the final list: "+listSize);
	}
}
