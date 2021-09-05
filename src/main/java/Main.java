

import java.util.Arrays;
import java.util.Scanner;

import data.ScoreableGame;
import logic.DuoDecimizer;
import logic.GameDataDownloader;
import logic.ScoreWriter;

public class Main {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello. "
				+ "Please write the UUID of the game you want to score, then press enter.");
		String uuid = in.nextLine();
		ScoreableGame scoreableGame = GameDataDownloader.getGameUpdates(uuid);
		System.out.println("Game retrieved...");
		
		System.out.println("Please enter the number of game updates you want scored, then press enter.");
		String limit = in.nextLine();
		ScoreableGame duodecimized = DuoDecimizer.convertLimitedUpdatesToDuoDecimal(scoreableGame, Integer.valueOf(limit));
		
		ScoreWriter.makeScore(duodecimized, Integer.valueOf(limit));
	}

}
