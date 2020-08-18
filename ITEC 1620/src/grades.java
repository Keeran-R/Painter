import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input your grade:");
		int grade = scan.nextInt();
		
		if (grade >100)
			System.out.println("This is an invalid grade");
		else if (grade >= 90) 
				System.out.println("This is an A+");
		else if (grade >= 80) 
			System.out.println("This is an A");
		else if (grade >= 75) 
			System.out.println("This is a B+");
		else if (grade >= 70) 
			System.out.println("This is a B");
		else if (grade >= 65) 
			System.out.println("This is a C+");
		else if (grade >= 60) 
			System.out.println("This is a C");
		else if (grade >= 55) 
			System.out.println("This is a D+");
		else if (grade >= 50) 
			System.out.println("This is a D");
		else 
			System.out.println("This is an F.");
		
	
	
	
	
	
	
	
	
	}

}
