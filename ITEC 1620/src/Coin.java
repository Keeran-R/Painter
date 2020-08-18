import java.util.*;
import java.text.*;
public class Coin {

	public static void main(String[] args) {
		
	int toonie, loonie, quarter, dime, nickel;
	double toonie_value, loonie_value, quarter_value, dime_value, nickel_value, total_d, total_c;
	
	
	Scanner scan = new Scanner (System.in);
	     
	toonie_value = 2;
	loonie_value = 1;
	quarter_value = 0.25;
	dime_value = 0.1;
	nickel_value = 0.05;
	
	System.out.println("How many toonies do you have?");
	toonie = scan.nextInt();
	
	System.out.println("How many loonies do you have?");
	loonie = scan.nextInt();
	
	System.out.println("How many quarters do you have?");
	quarter = scan.nextInt();
	
	System.out.println("How many dimes do you have?");
	dime = scan.nextInt();
	
	System.out.println("How many nickels do you have?");
	nickel = scan.nextInt();
	
	total_d = toonie * toonie_value + loonie * loonie_value;
	total_c	= quarter * quarter_value + dime * dime_value + nickel * nickel_value;
		
	DecimalFormat fmt = new DecimalFormat("0");
	
	float value_c = (float)total_c * 100;
	
	System.out.println("The total value of coins is " + fmt.format(total_d) + " dollar(s)" + " and " + fmt.format(value_c) + " cents.");
	}

}
