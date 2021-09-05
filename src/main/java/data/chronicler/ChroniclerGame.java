package data.chronicler;

import java.util.List;

public class ChroniclerGame {
	
	private String nextPage;
	private List<BlaseUpdate> data;
	
	public String getNextPage() {
		return nextPage;
	}
	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}
	public List<BlaseUpdate> getData() {
		return data;
	}
	public void setData(List<BlaseUpdate> data) {
		this.data = data;
	}

}
