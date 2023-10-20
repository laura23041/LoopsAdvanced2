import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
        String answer = "Laura";
        int guessCount = 0;
        

        
        while (true) {
            
            System.out.println("Guess my name (type stop to exit)");
            String guess = scanner.nextLine();
            guessCount++;

          
            if (guess.equalsIgnoreCase("stop"))
            
            {
            	guessCount--;
                break;
            }

          
            if (guess.equalsIgnoreCase(answer)) {
                System.out.println("Congratulations!");
                break;
            }
        }
        	if (guessCount > 0 && !answer.equalsIgnoreCase("stop"))
        		
        System.out.println("You guessed " + guessCount + " times.");
   
        scanner.close();
		
		
		
}
}
