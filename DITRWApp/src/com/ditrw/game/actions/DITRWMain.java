package com.ditrw.game.actions;

import java.util.ArrayList;
import java.util.Scanner;

import com.ditrw.game.objects.*;
import com.ditrw.game.users.*;

public class DITRWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Day in the Real World Game....");
		System.out.println();
		
		Player p1 = new Player();
		p1.setId(1);
		p1.setFirstName("Ronnie");
		p1.setLastName("King");
		
		ArrayList players = new ArrayList();
		players.add(p1);
		
		Board board = new Board();
		board.setPlayers(players);
		
		while(true){
			boolean gameOver = false;
			
			int playerCount = board.getCurrentPlayer();
			
			Player currentPlayer = (Player)board.getPlayers().get(playerCount);
			System.out.println("Your turn " + currentPlayer.getFirstName() + ". Press enter to roll: ");
			
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			
			int roll = Board.rollDice();
			System.out.println("You just rolled a " + roll);
			
			int boardPos = currentPlayer.getBoardPosition();
			currentPlayer.setBoardPosition(boardPos + roll);
			
			System.out.println();
			break;
		}

	}

}
