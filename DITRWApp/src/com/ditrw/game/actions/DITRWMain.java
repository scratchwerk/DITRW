package com.ditrw.game.actions;

import java.util.ArrayList;
import java.util.Scanner;

import com.ditrw.game.objects.*;
import com.ditrw.game.users.*;

public class DITRWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Day in the Real World Game....");
		
		Board board = new Board();
		
		Player p1 = new Player();
		p1.setId(1);
		p1.setFirstName("Ronnie");
		p1.setLastName("King");
		
		ArrayList players = new ArrayList();
		players.add(p1);
		board.setCurrentPlayer(p1);
		
		
		board.setPlayers(players);
		
		while(true){
			Player currentPlayer = board.getCurrentPlayer();
			
			System.out.println(currentPlayer.getFirstName() + " it is your turn...");
			System.out.println("Balance: $" + currentPlayer.getBankBalance() + " .... Press enter to roll..");
			
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			
			int roll = Board.rollDice();
			System.out.println("You just rolled a " + roll);
			
			BoardSquare bs = board.movePlayer(currentPlayer, roll);
			System.out.println("You just landed on " + bs.getSquareName());
			
			board.nextPlayer(currentPlayer);
			System.out.println("");
			
		}

	}

}
