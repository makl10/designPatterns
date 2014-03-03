package driver;

import game.Game;
import game.JGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

import loaders.GameCatalogueFileLoader;
import loaders.GameCatalogueLoader;
import arriba.Arriba;

import com.google.gson.Gson;

public class VersionOneDriver 
{
	public static void main(String[] args) 
	{
		VersionOneDriver.loadGameCatalogue("data/games/");
		
		System.out.println(Arriba.getInstance().getGameCatalogue());
	}
	
	public static void loadGameCatalogue(String pDirectory)
	{
		GameCatalogueLoader loader = new GameCatalogueFileLoader();
		
		File dir = new File(pDirectory);
		String[] gameList = dir.list();
		
		for(String game : gameList)
		{
			String newPath = pDirectory + game;
			
			try 
			{
				loader.loadGame(newPath);
			} 
			
			catch (ParseException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
