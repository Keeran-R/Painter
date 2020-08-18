import java.util.Scanner;

public class Tutorial_1 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Mortgage Amount");
	double amount = input.nextDouble();
	System.out.print("Enter Interest");
	double rate = input.nextDouble();
	//Amorization Period is represented in years
	System.out.print("Enter Amorization Period");
	int period = input.nextInt();
	
	period = period * 12;
	rate = rate / 100 / 12;
	
	double numerator = rate * amount;
	double denominator = Math.pow(1-(1/1+rate), period);
	double monthlypayment = numerator / denominator;
	
	System.out.print("The monthly payemnt is: $");
	System.out.println(monthlypayment);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
