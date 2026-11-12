package patterns.singletonpattern;

public class SingletonLazy {
	
	// Single instance of the class
	private static SingletonLazy sc = null;
	
	// Private constructor (prevents object creation outside of the class)
	private SingletonLazy() {}
	
	// Create the instance only when is needed
	public static SingletonLazy getInstance() {
		if(sc == null) {
			sc = new SingletonLazy();
		}
		return sc;
	}

}
