package com.ditrw.game.objects;

import java.util.ArrayList;
import java.util.HashMap;

import com.ditrw.game.users.Player;
import com.google.appengine.api.rdbms.AppEngineDriver;

public class Board {
	private ArrayList players = null;
	private int currentPlayer = 0;
	
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
	
	
	//move to the next player
	public Player nextPlayer(){
		Player player = null;
		
		int size = players.size();
		
		if(currentPlayer + 1 <= size){
			currentPlayer++;
			player = (Player)players.get(currentPlayer);
		}else{
			currentPlayer = 0;
			player = (Player)players.get(currentPlayer);
		}
		
		return player;
	}


	public ArrayList getPlayers() {
		return players;
	}


	public void setPlayers(ArrayList players) {
		this.players = players;
	}


	public int getCurrentPlayer() {
		return currentPlayer;
	}


	public void setCurrentPlayer(int currentPlayer) {
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
