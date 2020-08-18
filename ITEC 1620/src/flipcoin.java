import java.util.Random;

public class flipcoin {

	public static void main(String[] args) {
	
	Random generator = new Random();
	int num1;
	float num2;
	
	num1 = generator.nextInt(1) + 9;
	System.out.println("A Random integer: " + num1);
	
	}

}
