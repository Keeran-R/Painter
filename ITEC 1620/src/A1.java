import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double amount;
		
		System.out.println("50");
		amount = input.nextDouble();
				
		int remainingAmount = (int)(amount * 100);
		
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount" + amount + "consists of \n" + "\t" + numberOfOneDollars + "dollars\n" + "\t" + numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickels + " nickels\n" + "\t" + numberOfPennies + " pennies");
		
				
		
		input.close();
	}

}
