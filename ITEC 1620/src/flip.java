
public class flip {

	public static void main(String[] args) {
	
		 Coin fCoin = new Coin();
	      Coin sCoin = new Coin();
	      int fCounter=0, sCounter=0, nrFlips=0;

	      do {
	        fCoin.flip();
	        sCoin.flip();
	        nrFlips++;
	        System.out.println("flip " + nrFlips + " " + fCoin.toString() + " " +sCoin.toString());

	        if (fCoin.isHeads())
	               fCounter++;   
	        else
	               fCounter=0;

	        if (sCoin.isHeads())
	               sCounter++;  
	        else
	               sCounter=0;
	       }
	       while (fCounter<3 && sCounter<3);
	 
	       if (fCounter==3 && sCounter !=3)
	         System.out.println("First coin is the winner after " + nrFlips + " flips");
	      else if (sCounter==3 && fCounter !=3)
	         System.out.println("Second coin is the winner after " + nrFlips + " flips");
	      else
	         System.out.println("The race anded in a tie after " + nrFlips + " flips");
		
		
		
	}

}
