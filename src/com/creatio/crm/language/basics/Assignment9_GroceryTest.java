package com.creatio.crm.language.basics;

public class Assignment9_GroceryTest {

	public static void main(String[] args) {
		/*
		 * Create another class GroceryTest with main method that allows the user to interact with
the grocery list by calling the appropriate methods.
		 */
		//creating object for the grocery list class
		Assignment9_GroceryList groceryList=new Assignment9_GroceryList();
		//View the list of grocery before add 
		System.out.println("Grocery List before adding the item ");
		groceryList.viewList();
		//Adding new item to the list
		String[] addNewItem= {"Flours","Utencils","Dals","Biscuits","Chocolates","DairyProducts","Household Needs","Toys"};
		for(int i=0;i<addNewItem.length;i++) {
			groceryList.addItem(addNewItem[i]);
		}
		System.out.println("Grocery List after adding the item ");
		groceryList.viewList();
	//removing item from the list
		groceryList.removeItem("Utencils");
		groceryList.removeItem("Toys");
//View the list after removing item
		System.out.println("Grocery List after removing the item ");
		groceryList.viewList();
		
	}

}
