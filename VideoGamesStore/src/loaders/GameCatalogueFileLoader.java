package loaders;

import game.Game;
import game.JGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;

import arriba.Arriba;

import com.google.gson.Gson;

/**
 * @author Marc
 *  This loads a bunch of Json files from a given directory. Then adds each of these game into the GameCatalogue.
 *
 */
public class GameCatalogueFileLoader implements GameCatalogueLoader
{
	@Override
	public String loadGame(String pRelativeLocation) throws ParseException 
	{
		
		if(getGson(pRelativeLocation) == null)
		{
			System.out.println("Crash. This was bad.");
		}
		
		JGame jGame = getGson(pRelativeLocation);
		
		//Make game from the JStub
		int foo = Integer.parseInt(jGame.getMetascore());
		Game myGame = new Game(jGame.getName(), jGame.getCategory(), jGame.getGenre(), foo);		
		
		//Add to the global catalogue
		Arriba.getInstance().getGameCatalogue().addGame(myGame, myGame.getName());
		
		return myGame.getName();
	}
	
	/**
	 * Converts Json into JGame
	 * @param pPath the path to the json file
	 * @return the JGame associated with the json
	 */
	public JGame getGson(String pPath)
	{
		if(! new File(pPath).exists())
		{
			return null;
		}
		InputStreamReader json = new InputStreamReader(getInputStream(pPath));
		JGame gson = new Gson().fromJson(json, JGame.class);
		
		return gson;
	}
	
	/*
	 * Return a FileInputStream for the given path
	 */
	private InputStream getInputStream(String pFilePath)
	{
		try 
		{
			File file = new File(pFilePath);
			return new FileInputStream(file);
		}
		catch (FileNotFoundException e) 
		{
			return null;
		}
	}
}
