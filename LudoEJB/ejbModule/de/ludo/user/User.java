package de.ludo.user;

import java.io.Serializable;
import java.util.HashMap;

import de.ludo.game.Game;
import de.ludo.util.IdGen;


public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String userName;
	private String password;
	private HashMap<Integer, Game> games;
	
	public User(String userName, String password) {
		super();
		this.id = IdGen.getFreeId();
		this.userName = userName;
		this.password = password;
		this.games = new HashMap<>();
	}
	
	public void addNewGame (Game newGame){
		this.games.put(newGame.getId(), newGame);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	
}
