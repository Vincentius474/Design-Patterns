package patterns.singletonpattern;

public class SingletonLazyMultithreaded {
	
	// Single instance of the class
	private static SingletonLazyMultithreaded sc = null;
	
	// Private constructor (prevents object creation outside of the class)
	private SingletonLazyMultithreaded() {}
	
	/* Create the instance only when is needed 
	 * (make every thread wait for its turn before entering the method)
	 */
	public static synchronized SingletonLazyMultithreaded getInstance() {
		if(sc == null) {
			sc = new SingletonLazyMultithreaded();
		}
		return sc;
	}

}
