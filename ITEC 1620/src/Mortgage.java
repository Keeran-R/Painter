import java.util.Scanner;

public class Mortgage {


	public static void main(String[] args) {
	
	Scanner input = new Scanner("System.in");
	
	
	System.out.println("Enter the value of a:");
	int a = input.nextInt();
	System.out.println("Enter the value of b:");	
	int b = input.nextInt();
	System.out.println("Enter the value of c:" );
	int c = input.nextInt();
	
	double d = Math.pow(b, 2)-4*a*c;
	double	x1 = -b + Math.sqrt(d)/2*a;
	double x2 = -b - Math.sqrt(d)/2*a;
	
	
	System.out.println("x1 = " + x1);
	System.out.println("x2 = " + x2);

	
	}
}
