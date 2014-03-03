package arriba;

import game.Game;

import java.util.HashMap;
import java.util.Iterator;

public final class GameCatalogue implements Iterable<Game>
{
	private HashMap<String, Game> aGames;
	
	/**
	 * Create GameCatalogue object
	 */
	public GameCatalogue()
	{
		aGames = new HashMap<String, Game>();
	}
	
	/**
	 * @param pGame game to add
	 */
	public void addGame(Game pGame, String pKey)
	{
		aGames.put(pKey, pGame);
	}
	
	/**
	 * Removes a game from the catalogue.
	 * @param pGame the game to remove
	 */
	public void removeGame(String pKey)
	{
		aGames.remove(pKey);
	}
	
	/**
	 * @param pKey the name of the Game
	 * @return the Game associated with this key
	 */
	public Game getGame(String pKey)
	{
		return aGames.get(pKey);
	}
	
	public String toString()
	{
		return aGames.toString();
	}

	@Override
	public Iterator<Game> iterator() 
	{
		return aGames.values().iterator();
	}
	
}
