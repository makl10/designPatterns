package game;

public class Game 
{
	private String aName;
	private String aCategory;
	private String aGenre;
	private int aMetascore;
	
	public Game(String pName, String pCategory, String pGenre, int pMetascore)
	{
		aName = pName;
		aCategory = pCategory;
		aGenre = pGenre;
		aMetascore = pMetascore;
	}
	
	public String getName()
	{
		return aName;
	}
	
	public String getCategory()
	{
		return aCategory;
	}
	
	public String getGenre()
	{
		return aGenre;
	}
	
	public int getMetascore()
	{
		return aMetascore;
	}
	
	public String toString()
	{
		return ("Name: " + aName + "\n"
				+ "Cateogry: " + aCategory + "\n"
				+ "Genre: " + aGenre + "\n"
				+ "Metascore: " + aMetascore + "\n");
	}
}
