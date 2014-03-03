package game;

public class JGame 
{
	private String NAME;
	private String CATEGORY;
	private String GENRE;
	private String METASCORE;
	
	public String toString()
	{
		return ("Name: " + NAME + "\n"
				+ "Cateogry: " + CATEGORY + "\n"
				+ "Genre: " + GENRE + "\n"
				+ "Metascore: " + METASCORE + "\n");
	}
	
	public String getName()
	{
		return NAME;
	}
	
	public String getCategory()
	{
		return CATEGORY;
	}
	
	public String getGenre()
	{
		return GENRE;
	}
	
	public String getMetascore()
	{
		return METASCORE;
	}
}
