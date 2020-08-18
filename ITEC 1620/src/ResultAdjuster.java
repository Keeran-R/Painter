
import java.util.*;

public class ResultAdjuster {

	public static void main(String[] args) {
	
	//initialize variables and ask for # of results
		System.out.println("How many results do you have? ");
		Scanner scan = new Scanner(System.in); 
		double total = 0;
		double mean;
		int num = 0;
		num = scan.nextInt();
	
	//create array	
		double[] results = new double[num];
	
	//stops loop if less than 2 results
		if (num < 2) {
			mean = 0;
			System.out.println("ERROR");
		}
		//reads each result  typed by user
		else
			
			for(int index = 0;index < results.length; index++) {
			System.out.println("Enter result " + (index+1) + ": ");
			results[index] = scan.nextDouble();
			
		}
		
		//finding the total of all results
		scan.close();
		for (int i=0; i < results.length; i++) {
			total = total + results[i];
		}
		
		//finding the mean with lowest annulled
		Arrays.sort(results);
		mean = (total - results[0]) / (results.length-1);
		double rounded = Math.round(mean * 10)/10;
		
		System.out.println("The adjusted mean result is " + rounded);
		System.out.println("The lowest result is " + results[0]);
		
	}

}
