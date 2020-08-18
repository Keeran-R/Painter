import java.util.Random;

public class Assignment_2 {

	public static void main(String[] args) {
		

//Setting Variables	
boolean finish = false;

int first, player_1 = 0, second = 0, player_2 = 0;


Random rand = new Random();

//Loops until set to true
while(!finish) {
	
	
	//Dice set to +1 to not include 0
	first = rand.nextInt(6)+1;
	second = rand.nextInt(6)+1;
	player_1 += first + second;
	System.out.println("Player 1 rolls a " + first + " and a " + second);
	System.out.println("Player 1 now has " + player_1);
	
	if (first == second) {
		first = rand.nextInt(6)+1;
		second = rand.nextInt(6)+1;
		player_1 += first + second;
		System.out.println("Player 1 rolls again");
		System.out.println("Player 1 rolls a " + first + " and a " + second);
		System.out.println("Player 1 now has " + player_1);
		
	}
	
	first = rand.nextInt(6)+1;
	second = rand.nextInt(6)+1;
	player_2 += first + second;
	System.out.println("Player 2 rolls a " + first + " and a " + second);
	System.out.println("Player 2 has " + player_2);
	
	
	if (first == second) {
		first = rand.nextInt(6)+1;
		second = rand.nextInt(6)+1; 
		player_1 += first + second;
		System.out.println("Player 2 rolls again");
		System.out.println("Player 2 rolls a " + first + " and a " + second);
		System.out.println("Player 2 has " + player_1);	
		
	}

	if (player_1 >= 75) {
		finish  = true;
	}
	
	else if (player_2 >= 75) {
		finish = true;
	}

}
if (player_1 >= 75) {
	System.out.println("Player 1 wins");
}

else {
		System.out.println("Player 2 wins");
}
		
	}
	
}


