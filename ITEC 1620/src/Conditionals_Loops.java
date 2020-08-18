

public class Conditionals_Loops {

	public static void main(String[] args) {
		
	Die die = new Die();
	int count = 0;
	for (int num = 1; num <= 100; num++)
		if (die.roll() == 3)
			count++;
	System.out.println(count);
	
	}
			
}
