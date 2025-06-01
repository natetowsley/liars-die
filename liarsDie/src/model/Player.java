package model;

public class Player {
	private Cup Cup;
	private String username;
	
	public Player(String username) {
		this.username = username;
		this.Cup = new Cup();
	}
	
	public String GetUsername() {
		return username;
	}
	
	public Cup GetCup() {
		return this.Cup;
	}
}
