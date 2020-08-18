import java.util.Random;

public class Methods {

	public static void main(String[] args) {
		
		lyrics();
		double sum = cube(2,2);
		System.out.println(sum);
		double rand = random100();
	}
	public static void lyrics() {
		System.out.println("I'm calling for mariiiaaaa");
		System.out.println("I'm lost without mariiiaaaa");
	}
	public static double cube(int a, int b) {
		return Math.pow(a, b);
	}
	public static int random100() {
		Random generator = new Random();
		return generator.nextInt(100) + 1;
	}
	public static String Movie(String theTitle, String theDirector) {
		return theDirector;
		
		
	}
}
