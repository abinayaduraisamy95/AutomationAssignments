package com.creatio.crm.language.basics;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		/**
		 * This class contains the functions of 3D array
		 * description : A supermarket offers products in two main categories: "Groceries" and "Electronics." 
		 * Each category is further divided into four sub categories, with each sub category containing 
		 * five products.
		 */
		//A supermarket offers products in two main categories: "Groceries" and "Electronics." 
		String[] mainCategories= {"Groceries","Electronics"};
		String[] subCategories= {"Beverages","Snacks","Dairy Products","Produce"};
		
		//Initializing 3 d array to allocate memory for 2 main category, 4 sub category and 5 products
		
		String[][][] products=new String[2][4][5];
		
		//Main category 1: Groceries , sub category 1: Beverages
		products[0][0][0]="Cola";
		products[0][0][1]="Orange Juice";
		products[0][0][2]="Lemonade";
		products[0][0][3]="Green Tea";
		products[0][0][4]="Black coffee";
		
		//Main category 1: Groceries , sub category 2: Snacks
		products[0][1][0]="Cola";
		products[0][1][1]="Orange Juice";
		products[0][1][2]="Lemonade";
		products[0][1][3]="Green Tea";
		products[0][1][4]="Black coffee";
		
		//Main category 1: Groceries , sub category 3: Dairy Products
		products[0][2][0]="Cola";
		products[0][2][1]="Orange Juice";
		products[0][2][2]="Lemonade";
		products[0][2][3]="Green Tea";
		products[0][2][4]="Black coffee";
		
		//Main category 1: Groceries , sub category 4: Produce
		products[0][3][0]="Cola";
		products[0][3][1]="Orange Juice";
		products[0][3][2]="Lemonade";
		products[0][3][3]="Green Tea";
		products[0][3][4]="Black coffee";
		
		//Main category 2: Electronics , sub category : Beverages
		products[1][0][0]="Cola";
		products[1][0][1]="Orange Juice";
		products[1][0][2]="Lemonade";
		products[1][0][3]="Green Tea";
		products[1][0][4]="Black coffee";
		
		//Main category 2: Groceries , sub category 2: Snacks
		products[1][1][0]="Cola";
		products[1][1][1]="Orange Juice";
		products[1][1][2]="Lemonade";
		products[1][1][3]="Green Tea";
		products[1][1][4]="Black coffee";
		
		//Main category 2: Groceries , sub category 3: Dairy Products
		products[1][2][0]="Cola";
		products[1][2][1]="Orange Juice";
		products[1][2][2]="Lemonade";
		products[1][2][3]="Green Tea";
		products[1][2][4]="Black coffee";
		
		//Main category 2: Groceries , sub category 4: Produce
		products[1][3][0]="Cola";
		products[1][3][1]="Orange Juice";
		products[1][3][2]="Lemonade";
		products[1][3][3]="Green Tea";
		products[1][3][4]="Black coffee";
		

	}

}
