package inueron;

import java.util.Scanner;

class Guesser{
	int guessName;
	
	public int guessNumber(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessor kindly guess the number");
		guessName=scan.nextInt();
		return guessName;
	}
	
}

class Player {
	int playerGuessNum;
	
	public int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("player kindly guess the number");
		playerGuessNum=scan.nextInt();
		return playerGuessNum;
	}
}

class umpire {
	int numFromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	public void collectNumFromGuessor() {
		Guesser guess = new Guesser();	
		numFromGuesser = guess.guessNumber();
	
	}
	
	public void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numfromPlayer1 = p1.guessNumber();
		numfromPlayer2 = p2.guessNumber();
		numfromPlayer3 = p3.guessNumber();
		}
	
	public void compare() {
		if(numFromGuesser ==numfromPlayer1) {
			
			if(numFromGuesser ==numfromPlayer1 && numFromGuesser ==numfromPlayer3) {
				System.out.println("All three players guessed correctly");
			} else if(numFromGuesser ==numfromPlayer2) {
				System.out.println("Player 1 and player 2 guessed correctly");	
			}else if(numFromGuesser ==numfromPlayer3) {
				System.out.println("Player 1 and player 3 guessed correctly"); 
				} else
			System.out.println("Player 1 won the game");
		}
		else if(numFromGuesser ==numfromPlayer2){
			      if(numFromGuesser ==numfromPlayer3) {
				      System.out.println("Player 2 and 3 won the game");
			} else
			System.out.println("Player 2 won the game");
		}
		else if(numFromGuesser ==numfromPlayer3){
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost try again");
		}
	}
}
public class classGuessor {
	public static void main(String args[]) {
		umpire u = new umpire();
		u.collectNumFromGuessor();
		u.collectNumFromPlayer();
		u.compare();

	}

}
