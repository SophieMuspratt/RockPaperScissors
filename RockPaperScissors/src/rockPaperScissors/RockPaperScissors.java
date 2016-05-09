package rockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {

	private String playerOneChoice;
	private String playerTwoChoice;
	public int playerOneWins = 1;
	public int playerTwoWins = 2;
	public int draw = 0;
	private Scanner scan;
	
	public static void main(String [] args){
		RockPaperScissors RPS = new RockPaperScissors();
		RPS.getPlayerOneInput();
		RPS.playAgain();
	}
	
	private void getPlayerOneInput() {
		scan = new Scanner(System.in);
		System.out.println("Player one, please select Rock, Paper or Scissors");
		playerOneChoice =scan.nextLine();
		switch (playerOneChoice.toLowerCase()){ 
			case "rock":
				System.out.println("Player One has chosen Rock");
				getPlayerTwoInput();
				break;
			case "paper":
				System.out.println("Player One has chosen Paper");
				getPlayerTwoInput();
				break;
			case "scissors":
				System.out.println("Player One has chosen Scissors");
				getPlayerTwoInput();
				break;
			default:
				System.out.println("Invalid Input, please try again!");
				getPlayerOneInput();
				break;
		}
		
	}

	private void getPlayerTwoInput() {
		scan = new Scanner(System.in);
		System.out.println("Player two, please select Rock, Paper or Scissors");
		playerTwoChoice = scan.nextLine();
		switch (playerTwoChoice.toLowerCase()){ 
			case "rock":
				System.out.println("Player Two has chosen Rock");
				getWinner();
				break;
			case "paper":
				System.out.println("Player Two has chosen Paper");
				getWinner();
				break;
			case "scissors":
				System.out.println("Player Two has chosen Scissors");
				getWinner();
				break;
			default:
				System.out.println("Invalid Input, please try again!");
				getPlayerTwoInput();
				break;
		}
	}	
	
	public void playerOneChoice(String choice) {
		this.playerOneChoice = choice;
	}

	public void playerTwoChoice(String choice) {
		this.playerTwoChoice = choice;
	}

	public int getWinner() {
		if (playerOneChoice.toLowerCase().equals("rock") && playerTwoChoice.toLowerCase().equals("scissors")){
			System.out.println("Player One is the Winner! Rock Beats Scissors");
			return playerOneWins;	
			}
		else if (playerOneChoice.toLowerCase().equals("scissors") && playerTwoChoice.toLowerCase().equals("rock")){
			System.out.println("Player Two is the Winner! Rock Beats Scissors");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("scissors") && playerTwoChoice.toLowerCase().equals("paper")){
			System.out.println("Player One is the Winner! Scissors Beats Paper");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("paper") && playerTwoChoice.toLowerCase().equals("scissors")){
			System.out.println("Player Two is the Winner! Scissors Beats Paper");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("paper") && playerTwoChoice.toLowerCase().equals("rock")){
			System.out.println("Player One is the Winner! Paper Beats Rock");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("rock") && playerTwoChoice.toLowerCase().equals("paper")){
			System.out.println("Player Two is the Winner! Paper Beats Rock");
			return playerTwoWins;
		}
		else {
			System.out.println("It's a Draw!");
			return draw;
		}		
	}

	private void playAgain() {
		System.out.println("Would you like a rematch?");
		System.out.println("Please enter one of the following:");
		System.out.println("|Yes|\t|No|");
		String YN = scan.nextLine();
		
		if(YN.toLowerCase().equals("yes") || YN.toUpperCase().equals("Y")){
			RockPaperScissors.main(null);
		}
		else if (YN.toLowerCase().equals("no") || YN.toUpperCase().equals("N")){
			System.out.println("See you next time!");
		}
		else {
			System.out.println("Invalid input, please try again!");
			playAgain();
		}
		
	}

}
