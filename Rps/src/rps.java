import java.util.Scanner;
import java.util.Random;

public class rps {

	static int player, computer;
	static Random rand = new Random();
	static String used = "";

	public static void main(String args[]) {
		System.out.println("Rock paper scissors");
		
		int score = 0;
		int cpuScore = 0;
		while ( score < 3 && cpuScore < 3){
           /*Loop continues til either
			of the players hit 3*/
			System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors");
			Scanner plc = new Scanner(System.in);
			player = plc.nextInt();
			computer = (int) (Math.random() * 3);
			
			

			switch (computer) {
			case 0:
				used = " [0] Rock";
				break;
			case 1:
				used = " [1] Paper";
				break;
			case 2:
				used = " [2] Scissors";
				break;

			default:
				break;
			}

			if (player == computer) {
				
				System.out.println("Draw m8! computer used " + used); 
			} else if (player == computer + 1 ) {
				score++;// won

				System.out.println("U Won m8! computer used " + used );
			} else {
				cpuScore++;// loss
				System.out.println("U lost m8, computer used " + used );
				
			}
			
			if (score == 3) {
				System.out.println("you won! " + "Player: "
						+ "" + score +" , Computer:" + cpuScore); }
			else if (cpuScore == 3) {
				System.out.println("The computer won! " + 
			"Computer: " + cpuScore + ", Player: " + score);
				
			}  
		}
	}
}

