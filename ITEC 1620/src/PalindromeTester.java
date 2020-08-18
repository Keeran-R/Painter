import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		
		String str, another = "y";
		int left, right;
		
		Scanner scan = new Scanner(System.in);
		
		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();
			
			//CHANGE STARTS HERE
			//converts string right away
			str.toLowerCase();
			
			//setting up temporary variables
			char temp;
			String junk = "";
			
			//loops through entire string removing non digits
			for(int i = 0; i < str.length();i++) {
				
				temp = str.charAt(i);
				
				if(Character.isLetterOrDigit(temp)) {
					//puts all letters or digits to junk
					junk += temp;
				}
			}
		
		//make junk = str, since we removed everything we needed to in the loop above
		str = junk;
		//CHANGE ENDS HERE
		
		left = 0;
		right = str.length() - 1;
		
		while (str.charAt(left) == str.charAt(right) && left < right)
		{
			left++;
			right--;
		}
		
		System.out.println();
		
		// after the loop ends …
		if (left < right)
			System.out.println("That string is NOT a palindrome.");
		else
			System.out.println("That string IS a palindrome.");
		
		System.out.println();
		System.out.print("Test another palindrome (y/n)? ");
		another = scan.nextLine();
		}

	}

}
