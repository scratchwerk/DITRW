package com.ditrw.game.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.ditrw.game.users.Player;
import com.google.appengine.api.rdbms.AppEngineDriver;

public class Board {
	private ArrayList players = null;
	private Player currentPlayer;
	
	//board questions
	private ArrayList group1Questions = null;
	private ArrayList group2Questions = null;
	private ArrayList group3Questions = null;
	private ArrayList group4Questions = null;
	
	private int group1Pos = 0;
	private int group2Pos = 0;
	private int group3Pos = 0;
	private int group4Pos = 0;
	
	
	private HashMap outerSquares = null; 
	private HashMap innerSquares = null; 
	
	
	public Board(){
		this.outerSquares = new HashMap();
		this.innerSquares = new HashMap();
		
		for(int x=1; x < 33; x++){
			BoardSquare bs = new BoardSquare();
			bs.setSquarePosition(x);
			bs.setSquareName("OuterSquare#" + x);
			this.outerSquares.put(x, bs);
		}
		
		for(int x=1; x < 25; x++){
			BoardSquare bs = new BoardSquare();
			bs.setSquarePosition(x);
			bs.setSquareName("InnerSquare#" + x);
			this.innerSquares.put(x, bs);
		}
		
	}
	
	//move to the next player
	public Player nextPlayer(Player currentPlayer){
		Player player = null;
		
		int size = players.size();
		
		if(currentPlayer.getId() + 1 <= size){
			player = (Player)players.get(currentPlayer.getId() +1);
			this.currentPlayer = player;
		}else{
			player = (Player)players.get(0);
			this.currentPlayer = player;
		}
		
		return player;
	}

	
	public static int rollDice(){
		Random r = new Random();
		int i1=r.nextInt(13-1) + 1;
		return i1;
	}
	
	public BoardSquare movePlayer(Player player, int dice){
		BoardSquare bs = null;
		
		int pos = player.getBoardPosition();
		int ringSpaces = 0;
		
		if(player.isInInner()){
			ringSpaces = this.innerSquares.size();
		}else{
			ringSpaces = this.outerSquares.size();
		}
		
		int newPos = -1;
		if((pos + dice) > ringSpaces){
			newPos = pos - ringSpaces + dice;
			player.setBoardPosition(newPos);
		}else{
			newPos = pos + dice;
			player.setBoardPosition(newPos);
		}
		
		if(player.isInInner()){
			bs = (BoardSquare) this.innerSquares.get(newPos);
		}else{
			bs = (BoardSquare) this.outerSquares.get(newPos);
		}
		
		return bs;
	}

	public ArrayList getPlayers() {
		return players;
	}


	public void setPlayers(ArrayList players) {
		this.players = players;
	}


	public Player getCurrentPlayer() {
		return currentPlayer;
	}


	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}


	public ArrayList getGroup1Questions() {
		return group1Questions;
	}


	public void setGroup1Questions(ArrayList group1Questions) {
		this.group1Questions = group1Questions;
	}


	public ArrayList getGroup2Questions() {
		return group2Questions;
	}


	public void setGroup2Questions(ArrayList group2Questions) {
		this.group2Questions = group2Questions;
	}


	public ArrayList getGroup3Questions() {
		return group3Questions;
	}


	public void setGroup3Questions(ArrayList group3Questions) {
		this.group3Questions = group3Questions;
	}


	public ArrayList getGroup4Questions() {
		return group4Questions;
	}


	public void setGroup4Questions(ArrayList group4Questions) {
		this.group4Questions = group4Questions;
	}


	public int getGroup1Pos() {
		return group1Pos;
	}


	public void setGroup1Pos(int group1Pos) {
		this.group1Pos = group1Pos;
	}


	public int getGroup2Pos() {
		return group2Pos;
	}


	public void setGroup2Pos(int group2Pos) {
		this.group2Pos = group2Pos;
	}


	public int getGroup3Pos() {
		return group3Pos;
	}


	public void setGroup3Pos(int group3Pos) {
		this.group3Pos = group3Pos;
	}


	public int getGroup4Pos() {
		return group4Pos;
	}


	public void setGroup4Pos(int group4Pos) {
		this.group4Pos = group4Pos;
	}


	public HashMap getOuterSquares() {
		return outerSquares;
	}


	public void setOuterSquares(HashMap outerSquares) {
		this.outerSquares = outerSquares;
	}


	public HashMap getInnerSquares() {
		return innerSquares;
	}


	public void setInnerSquares(HashMap innerSquares) {
		this.innerSquares = innerSquares;
	}
	
	
	
}
