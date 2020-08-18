import java.util.Scanner;

public class Programming_Expressions {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner("System.in");
	
	System.out.println("Enter the amount:");
	int a = scan.nextInt();
	System.out.println("Enter the annual interest percent:");
	double r = scan.nextDouble();
	System.out.println("Enter the amoritization in years");
	int n = scan.nextInt();
	
	
	double p = r*a/1-(1/Math.pow(1+r, n));
	
	
	System.out.println("The monthly payment is:" + p);
		
	
	

	}

}
