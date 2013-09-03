package com.scratchwerk.ditrw.remote;

import com.google.appengine.tools.remoteapi.RemoteApiInstaller;
import com.google.appengine.tools.remoteapi.RemoteApiOptions;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import java.io.IOException;



public class BoardRemoteDB {

	public static void main(String[] args) {

		String username = "Something";
        String password = "New";
        RemoteApiOptions options = new RemoteApiOptions().server("localhost", 8888).credentials(username, password);
        RemoteApiInstaller installer = new RemoteApiInstaller();
        try {
			installer.install(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
            DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
            for(int x=1; x < 33; x++){
             Entity boardSquare = new Entity("BoardSquare", x);

             boardSquare.setProperty("squareType", 0);
             boardSquare.setProperty("squarePosition", x);
             boardSquare.setProperty("squareName", "Go");
            
             System.out.println("Key of new entity is " + ds.put(boardSquare));
            }
        } finally {
            installer.uninstall();
        }





	}
	
	public static void connectProd() {

		String username = System.console().readLine("username: ");
        String password =  new String(System.console().readPassword("password: "));
        RemoteApiOptions options = new RemoteApiOptions().server("your_app_id.appspot.com", 443).credentials(username, password);
        RemoteApiInstaller installer = new RemoteApiInstaller();
        try {
			installer.install(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
            DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
            System.out.println("Key of new entity is " + ds.put(new Entity("Hello Remote API!")));
        } finally {
            installer.uninstall();
        }


	}

}
