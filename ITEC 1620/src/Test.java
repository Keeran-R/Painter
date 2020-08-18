import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int miles;
	double gallons, mpg;
	
	System.out.println("Enter the number of miles: ");
	miles = scan.nextInt();
	
	System.out.println("Enter the number of gallons: ");
	gallons = scan.nextDouble();

	mpg = miles / gallons;
	
	System.out.println("Miles Per gallons:" + mpg);
	}

}
