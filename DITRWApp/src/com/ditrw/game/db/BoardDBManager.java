package com.ditrw.game.db;


import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.ditrw.game.objects.Board;
import com.ditrw.game.objects.BoardSquare;

public class BoardDBManager {


	public static HashMap generateBoard(){
		HashMap squares = null;
		
		try{
			DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
			Query query = new Query("BoardSquare");
			List<Entity> boardSquares = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(10));
			Iterator it = boardSquares.iterator();
			while(it.hasNext()){
				BoardSquare bs = new BoardSquare();
				Entity et = (Entity)it.next();
				bs.setSquareName((String) et.getProperty("squareName"));
				bs.setSquarePosition((Integer) et.getProperty("squarePosition"));
				bs.setSquareType((Integer) et.getProperty("squareType"));
				squares.put(bs.getSquarePosition(), bs);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return squares;
	}

}