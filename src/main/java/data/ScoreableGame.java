package data;

import java.util.List;

public class ScoreableGame {
	
	private Integer season;
	private Integer day;
	private String awayTeam;
	private String homeTeam;
	private List<String> gameUpdates;
	
	public String getFullDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append("Season ").append(season +1)
			.append(" Day ").append(day +1).append(", ")
			.append(awayTeam).append(" at ").append(homeTeam);
		return sb.toString();
	}
	
	public Integer getSeason() {
		return season;
	}
	public void setSeason(Integer season) {
		this.season = season;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public List<String> getGameUpdates() {
		return gameUpdates;
	}
	public void setGameUpdates(List<String> gameUpdates) {
		this.gameUpdates = gameUpdates;
	}
}
