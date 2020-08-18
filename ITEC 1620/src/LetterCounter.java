import java.util.Scanner;

public class LetterCounter {

	public static void main(String[] args) {
		
		String s;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type anything");
		s = scan.nextLine();
		
		int a = 0,e = 0,i = 0,o = 0,u = 0, con = 0;
		for (int r = 0; r < s.length(); r++){
			
			if(s.charAt(r) == 'a') {
				a++;	
			}else if (s.charAt(r) == 'e') {
				e++;
			}else if(s.charAt(r) == 'i') {
				i++;
			}else if(s.charAt(r) == 'o') {
				o++;
			}else if(s.charAt(r) == 'u') {
				u++;
			}else {
				con++;
			}
			
		}
		System.out.println("a: " + a + " e: " + e + " i: " + i + " o: " + o + " u: " + u  + " non-vowels: " + con); 
	}

}
