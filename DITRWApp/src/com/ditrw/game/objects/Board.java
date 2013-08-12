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
	
	//pick a 
	
}
