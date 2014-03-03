package loaders;

import java.text.ParseException;

public interface GameCatalogueLoader 
{
	String loadGame(String pRelativeLocation) throws ParseException;
}
