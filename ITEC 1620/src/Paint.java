import java.util.*;
public class Paint {

	public static void main(String[] args) {
		
	
	int length, width, height, door, window, door_area, window_area;
	double totalSqFt, paintNeeded;
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("What is the length of the room?");
	length = scan.nextInt();
	
	System.out.println("What is the width of the room?");
	width = scan.nextInt();
	
	System.out.println("What is the height of the room?");
	height = scan.nextInt();
	
	totalSqFt = length * width * height;
	
	System.out.println("How many doors do you have?");
	door = scan.nextInt();
	
	System.out.println("How many windows do you have?");
	window = scan.nextInt();
	
	door_area = 18 * door;
	window_area = 25 * window;
	
	paintNeeded = (2 * length * width) + (2 * height * length) + (2 * height * width) - (door_area + window_area);
	
	System.out.println(paintNeeded + " gallons of paint are needed to paint a room\n" + width + " feet wide by " + length + " feet long by " + height + " feet high with\n " + door + "doors and " + window + " windows." );

	}

}
