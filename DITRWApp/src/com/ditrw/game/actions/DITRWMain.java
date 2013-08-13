package com.ditrw.game.actions;

import java.util.ArrayList;

import com.ditrw.game.objects.*;
import com.ditrw.game.users.*;

public class DITRWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Day in the Real World Game....");
		
		Player p1 = new Player();
		p1.setId(1);
		p1.setFirstName("Ronnie");
		p1.setLastName("King");
		
		ArrayList players = new ArrayList();
		players.add(p1);
		
		Board board = new Board();
		board.setPlayers(players);
		
		while(true){
			int currentPlayer = board.getCurrentPlayer();
			
			
		}

	}

}
