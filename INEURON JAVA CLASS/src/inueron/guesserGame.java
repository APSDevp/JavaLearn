package inueron;
import java.lang.Math; 
import java.util.concurrent.ThreadLocalRandom;

class gameStarts {
	
	public int guessor() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
		return randomNum;
	}
	
	public int player() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
		return randomNum;
	}
}

public class guesserGame {
	
	public static void main(String args[]) {
		
		gameStarts game = new gameStarts();
		int gussedNum = game.guessor();
		System.out.println( gussedNum);
		
		
	}

}
