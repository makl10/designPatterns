package loaders;

@SuppressWarnings("serial")
public class GameCatalogueLoaderException extends RuntimeException
{
	public GameCatalogueLoaderException() {}
	public GameCatalogueLoaderException(String pMessage) { super(pMessage); }
	public GameCatalogueLoaderException(Throwable pThorwable) { super(pThorwable); }
	public GameCatalogueLoaderException(String pMessage, Throwable pThrowable) { super(pMessage, pThrowable); }
}
