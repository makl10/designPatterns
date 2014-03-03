package arriba;

public final class Arriba 
{
	private static final Arriba INSTANCE = new Arriba();
	private GameCatalogue aCatalogue;
	
	/**
	 * Private Constructor to support the Singleton design pattern
	 */
	private Arriba()
	{
		aCatalogue = new GameCatalogue();
	}
	
	/**
	 * @return instance of Arriba
	 */
	public static Arriba getInstance()
	{
		return INSTANCE;
	}
	
	/**
	 * @return the Game Catalogue
	 */
	public GameCatalogue getGameCatalogue()
	{
		return aCatalogue;
	}
	
}
