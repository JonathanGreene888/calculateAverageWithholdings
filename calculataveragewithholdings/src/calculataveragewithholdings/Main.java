package calculataveragewithholdings;
import java.util.Scanner;  // Import the Scanner class

public class Main {
	public static void calculataveragewithholdings(String[] args) {
	// Average is the total values added up divided by the number of values
	// create float variable for tax rate. 
	// ask for income from user in an integer variable
	// determine if user income fits the following criteria. 
	// if user has income less than 500 then set tax rate variable to 0.10
	// if user has income 500 >= and < 1500 set tax rate to 0.15
	// if user has income 1500 >= and < 2500 set tax rate to 0.20
	// if user has income 2500 >= set tax rate to 0.30
	// display to the user the tax rate income and how much tax has been withheld
	

	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Please enter your income:");
	Integer income = myObj.nextInt();
	Float taxRate = 0.0f;
	
	if(income < 500 ) {
		taxRate = 0.10f;		
	} else if (income >= 500 && income <1500) {
		taxRate = 0.15f;
	} else if (income >= 1500 && income < 2500) {
		taxRate = 0.20f;
	} else {
		taxRate = 0.30f;
	}
	
	// Close the scanner
	myObj.close();
	System.out.println("Your average weekly tax withholding is: " + income / taxRate);

	}
	
}
