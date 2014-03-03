package loaders;

import java.text.ParseException;

/**
 * @author Marc
 * 
 * An interface to design the contract that any Game Catalogue loader must follow.
 *
 */
public interface GameCatalogueLoader 
{
	String loadGame(String pRelativeLocation) throws ParseException;
}
