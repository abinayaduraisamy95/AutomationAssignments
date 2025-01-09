package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.lang.*;

public class Assignment7_BankTransactions {

	public static void main(String[] args) {
		/*
		 * Positive value refers Credit and Negative refers Debit Transaction
		 * Transactions Amount 1 50000 2 -2000 3 3000 4 -15000 5 -200 6 -300 7 4000 8
		 * -3000 First Store all the transactions in any data structure of Your Choice
		 * from collections, and by using Loops and conditional statements 1. Print
		 * total number of credit and debit transactions completed 2. Print the total
		 * amount credited and debited in account 3. Print total amount remaining at the
		 * end in Bank Account 4. If any transaction limit exceeds +/- 10000 then print
		 * the message “Suspicious credit/ debit Transaction with Amount” and also print
		 * total number of suspicious transactions
		 */

		// Creating List Variable to store the credit and debit transactions
		List<Integer> creditDebitTransactioons = new ArrayList<Integer>();
		creditDebitTransactioons.add(-2000);
		creditDebitTransactioons.add(-15000);
		creditDebitTransactioons.add(-200);
		creditDebitTransactioons.add(-300);
		creditDebitTransactioons.add(-3000);
		creditDebitTransactioons.add(50000);
		creditDebitTransactioons.add(3000);
		creditDebitTransactioons.add(4000);

		// 1 Print total number of credit and debit transactions completed
		int totalTransactions = creditDebitTransactioons.size();
		System.out.println("==========1 Print total number of credit and debit transactions completed==========");
		System.out.println("The total number of credit and debit transactions completed are : " + totalTransactions);
		System.out.println();

		// 2 Print the total amount credited and debited in account
		System.out.println("==========2 Print the total amount credited and debited in account==========");
		int debitAmount = 0;
		int creditAmount = 0;
		for (int totalAmount : creditDebitTransactioons) {
			if (totalAmount > 0) {
				creditAmount = creditAmount + totalAmount;
			} else {
				debitAmount = debitAmount + totalAmount;
			}
		}
		System.out.println("Total amount Credited = " + creditAmount);
		System.out.println("Total amount Debited = " + debitAmount);
		System.out.println();

		// 3 Print total amount remaining at the end in Bank Account
		System.out.println("==========3 Print total amount remaining at the end in Bank Account==========");
		int bankBalance = creditAmount - debitAmount;
		System.out.println("Total amount remaining at the end in Bank Account = " + bankBalance);
		System.out.println();

		// 4 If any transaction limit exceeds +/- 10000 then print the message “Suspicious
		// credit/ debit Transaction with Amount”
		System.out.println("==========4 If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit Transaction with Amount”==========");
		int suspiciousTrans = 0;
		for (int i = 0; i < totalTransactions; i++) {

			if ((creditDebitTransactioons.get(i) > 10000) || (creditDebitTransactioons.get(i) < -10000)) {
				System.out.println(
						"The Suspicious credit/ debit Transaction with Amount = " + creditDebitTransactioons.get(i));
				suspiciousTrans++;
			}
		}
		// and also print total number of suspicious transactions
		System.out.println("Total Number of Suspicious transactions are : " + suspiciousTrans);

	}

}
