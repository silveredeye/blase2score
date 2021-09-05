package data.chronicler;

public class BlaseUpdate {
	
	private String gameId;
	private String timestamp;
	private String hash;
	private BlaseGame data;
	
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public BlaseGame getData() {
		return data;
	}
	public void setData(BlaseGame data) {
		this.data = data;
	}
	
	

}
