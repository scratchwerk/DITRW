package com.ditrw.game.users;

public class WorkPunchCard {

	private int id;
	private int gameID;
	private int citizenID;
	private boolean checkIn = false;
	private boolean checkOut = false;
	private int interval;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGameID() {
		return gameID;
	}
	public void setGameID(int gameID) {
		this.gameID = gameID;
	}
	public int getCitizenID() {
		return citizenID;
	}
	public void setCitizenID(int citizenID) {
		this.citizenID = citizenID;
	}
	public boolean isCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public boolean isCheckOut() {
		return checkOut;
	}
	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	
	
}
