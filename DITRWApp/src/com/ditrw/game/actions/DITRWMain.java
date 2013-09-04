package com.ditrw.game.actions;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ditrw.game.objects.*;
import com.ditrw.game.users.*;

@Controller
public class DITRWMain {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String homepage(ModelMap model) {
		return "index";
	}
	
	@RequestMapping(value="/game/start", method = RequestMethod.GET)
	public String startGame(ModelMap model) {
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

		return "move";
		


	}
	
	@RequestMapping(value="/game/move", method = RequestMethod.GET)
	public String movePlayer(ModelMap model) {
		
		/*
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

		}*/
		
		
		return "move";
	}

}
