package game;

/**
 * @author Marc
 * Thie class represents a Game object in the Arriba world.
 *
 */
public class Game 
{
	private String aName;
	private String aCategory;
	private String aGenre;
	private int aMetascore;
	
	/**
	 * @param pName the name of the game
	 * @param pCategory the category of the game
	 * @param pGenre the genre of the game
	 * @param pMetascore the metascore of the game
	 */
	public Game(String pName, String pCategory, String pGenre, int pMetascore)
	{
		aName = pName;
		aCategory = pCategory;
		aGenre = pGenre;
		aMetascore = pMetascore;
	}
	
	/**
	 * @return the name of the game
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return the category of the game
	 */
	public String getCategory()
	{
		return aCategory;
	}
	
	/**
	 * @return pGenre the genre of the game
	 */
	public String getGenre()
	{
		return aGenre;
	}
	
	/**
	 * @return pMetascore the metascore of the game
	 */
	public int getMetascore()
	{
		return aMetascore;
	}
	
	@Override
	public String toString()
	{
		return ("Name: " + aName + "\n"
				+ "Cateogry: " + aCategory + "\n"
				+ "Genre: " + aGenre + "\n"
				+ "Metascore: " + aMetascore + "\n");
	}
}
