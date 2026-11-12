package patterns.singletonpattern;

public class SingletonEager {

	// Create the instance only when is not needed
	private static SingletonEager sc = new SingletonEager();
	
	// Private constructor (prevents object creation outside of the class)
	private SingletonEager(){}
	
	// Return the instance of the class
	public static SingletonEager getInstance(){
		return sc;
	}
	
}
