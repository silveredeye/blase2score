package logic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import data.ScoreableGame;
import data.chronicler.BlaseGame;
import data.chronicler.BlaseUpdate;
import data.chronicler.ChroniclerGame;

public class GameDataDownloader {
	
	//https://api.sibr.dev/chronicler/v1/games/updates?game=4e3aadf4-ca4f-45c9-a258-446541939704&count=2000
	private static final String CHRONICLER_BASE_URL= "https://api.sibr.dev/chronicler/v1/games/updates?game=";
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static ScoreableGame getGameUpdates(String gameUuid) {
		ScoreableGame scoreableGame = new ScoreableGame();
		String gameJson = getJson(CHRONICLER_BASE_URL + gameUuid);
		
		if (gameJson.contains("\"error\":")) {
			System.out.println("An error occurred while getting game data! Sorry!");
			return null;
		}
		try {
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			ChroniclerGame blaseGames = mapper.readValue(gameJson, new TypeReference<ChroniclerGame>(){});
			
			BlaseGame firstUpdate = blaseGames.getData().get(0).getData();
			scoreableGame.setSeason(firstUpdate.getSeason());
			scoreableGame.setDay(firstUpdate.getDay());
			scoreableGame.setAwayTeam(firstUpdate.getAwayTeamName());
			scoreableGame.setHomeTeam(firstUpdate.getHomeTeamName());
			scoreableGame.setGameUpdates(new ArrayList<String>());
			
			for (BlaseUpdate gameUpdate: blaseGames.getData()) {
				scoreableGame.getGameUpdates().add(gameUpdate.getData().getLastUpdate());
			}
			
			return scoreableGame;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static String getJson(String address) {
		try {
		    URL myURL = new URL(address);
		    URLConnection conn = myURL.openConnection();
		    
	        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        String inputLine;
	        StringBuffer json = new StringBuffer();
	        
	        while ((inputLine = in.readLine()) != null) {
	        	json.append(inputLine);
	        }
	        in.close();
	        return json.toString();
		}
		catch (Exception e) {
		    System.out.println("Exception when connecting to URL " + address + ", nested exception is" + e.getStackTrace());
		}
		return null;
	}
}
