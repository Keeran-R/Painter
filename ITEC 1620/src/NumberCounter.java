import java.util.Scanner;

public class NumberCounter {

	public static void main(String[] args) {
		
		int digit = 0, even = 0, odd = 0, zero = 0;
		String num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = scan.next();
		
		
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			digit = Integer.parseInt(Character.toString(c));
		
		if (digit  == 0) {
			zero++;
		}else if ((digit % 2) == 0) {
			even++;
		}else
			odd++;
		
		}
	System.out.println("even: " + even + " odd: " + odd + " zero: " + zero);
			
		
	}

}
