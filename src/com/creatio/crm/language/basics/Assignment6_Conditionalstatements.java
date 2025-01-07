package com.creatio.crm.language.basics;

public class Assignment6_Conditionalstatements {

	public static void main(String[] args) {
		/*
		 * A bank evaluates loan applicants based on the following criteria: 1. Credit
		 * Score: o If the credit score is above 750, the loan is automatically
		 * approved. o If the credit score is between 650 and 750, additional checks are
		 * performed. o If the credit score is below 650, the loan is denied. 2. Income:
		 * o For credit scores between 650 and 750, the customer’s income must be at
		 * least $50,000 for the loan to be considered.
		 * 
		 * 3. Employment Status: o If the customer’s income is at least 50,000, the
		 * system checks whether the customer is employed. o If the customer is
		 * unemployed, the loan is denied. 4. Debt-to-Income Ratio: o If the customer is
		 * employed, the system checks the debt-to-income (DTI) ratio. o If the DTI
		 * ratio is less than 40%, the loan is approved. o If the DTI ratio is 40% or
		 * greater, the loan is denied.
		 * 
		 * Now based on below details, print whether user is eligible to get the loan or
		 * not customerName = "John Doe"; creditScore = 720; income = 55000.0;
		 * isEmployed = true; debtToIncomeRatio = 35.0;
		 * 
		 */
		// Customer details to check for loan eligibility
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		// Credit Score condition
		// If the credit score is above 750, the loan is automatically approved.

		if (creditScore > 750) {
			System.out.println("The customer Credit score is > 750 , so he is automatically eligible for loan ");
		} 
		//If the credit score is between 650 and 750, additional checks are performed.
		else if ((creditScore >= 650) && (creditScore <= 750)) {
			System.out.println("The credit score is between 650 and 750, additional checks are performed.");
			/*
			 * Income: For credit scores between 650 and 750, the customer’s income must be
			 * at least $50,000 for the loan to be considered.
			 */
			if (income >= 50000.0) {
				/*
				 * Employment Status: If the customer’s income is at least 50,000, the system
				 * checks whether the customer is employed.
				 */
				System.out.println("The income of "+customerName+" is :"+income+" , which is > than 50,000. Verifying the employment status");
				if (isEmployed == true) {
					/*
					 * Debt-to-Income Ratio: o If the customer is employed, the system checks the
					 * debt-to-income (DTI) ratio. o If the DTI ratio is less than 40%, the loan is
					 * approved. o If the DTI ratio is 40% or greater, the loan is denied.
					 */
					System.out.println("The status of "+customerName+" employment is :"+isEmployed+" , Verifying the DTI ratio.");
					if (debtToIncomeRatio < 40.0) {
						System.out.println("The DTI ratiof of the customer : "+customerName+" is "+debtToIncomeRatio);
						System.out.println("The DTI ratio is less than 40%, the loan is approved. " + customerName
								+ " is Eligible for Loan");
					} else {
						System.out.println("The DTI ratio is 40% or greater, the loan is denied");
					}

				} else {
					System.out.println("The customer is unemployed, the loan is denied.");
				}
			}
		}

		else {
			System.out.println("The credit score is below 650, the loan is denied.");
		}

	}

}
