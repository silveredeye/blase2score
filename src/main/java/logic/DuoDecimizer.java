package logic;

import java.util.ArrayList;

import data.ScoreableGame;

public class DuoDecimizer {
	
	public static ScoreableGame convertLimitedUpdatesToDuoDecimal(ScoreableGame game, Integer limit) {
		ScoreableGame duodecimizedGame = new ScoreableGame();
		
		duodecimizedGame.setAwayTeam(game.getAwayTeam());
		duodecimizedGame.setDay(game.getDay());
		duodecimizedGame.setHomeTeam(game.getHomeTeam());
		duodecimizedGame.setSeason(game.getSeason());
		duodecimizedGame.setGameUpdates(new ArrayList<String>());
		
		for (int i=0; i<limit; i++) {
			duodecimizedGame.getGameUpdates().add(duoDecimizeString(game.getGameUpdates().get(i)));
		}
		
		return duodecimizedGame;
	}

	private static String duoDecimizeString(String str) {
		String duodecimizedString = "";
		
		for (int character: str.codePoints().toArray()) {
			if (character == 32) {
				duodecimizedString.concat(" ");
			} else {
				duodecimizedString +=moduloTwelve(character);
			}
		}
		return duodecimizedString;
	}
	
	private static String moduloTwelve(int ch) {
		int moduloed = ch %12;
		if (moduloed == 11) {
			return "b";
		} else if (moduloed == 10) {
			return "a";
		} else {
			return String.valueOf(moduloed);
		}
	}
}
