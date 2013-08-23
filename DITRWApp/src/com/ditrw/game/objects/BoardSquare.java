package com.ditrw.game.objects;

import com.google.appengine.api.datastore.Key;

public class BoardSquare {
	
	private Key id;
	private int squareType = 0;
	private String squareName = "";
	private int squarePosition = -1;
	
	public int getSquareType() {
		return squareType;
	}
	public void setSquareType(int squareType) {
		this.squareType = squareType;
	}
	public String getSquareName() {
		return squareName;
	}
	public void setSquareName(String squareName) {
		this.squareName = squareName;
	}
	public int getSquarePosition() {
		return squarePosition;
	}
	public void setSquarePosition(int squarePosition) {
		this.squarePosition = squarePosition;
	}
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}
	
	
	
	
}
