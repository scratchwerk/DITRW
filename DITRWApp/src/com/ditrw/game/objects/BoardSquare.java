package com.ditrw.game.objects;

public class BoardSquare {
	
	private int squareType = 0;
	private String name = "";
	private int boardPosition = 0;
	private int amt = 0;
	private int moveToSquare = -1;
	
	public static final int Payment = 1;
	public static final int QuestionA = 2;
	public static final int QuestionB = 3;
	public static final int QuestionC = 4;
	public static final int QuestionD = 5;
	public static final int Transition = 6;
	
	
	public int getSquareType() {
		return squareType;
	}
	public void setSquareType(int squareType) {
		this.squareType = squareType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBoardPosition() {
		return boardPosition;
	}
	public void setBoardPosition(int boardPosition) {
		this.boardPosition = boardPosition;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public int getMoveToSquare() {
		return moveToSquare;
	}
	public void setMoveToSquare(int moveToSquare) {
		this.moveToSquare = moveToSquare;
	}
	
	
}
