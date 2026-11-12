package patterns.singletonpattern;

public class SingletonLazyDoubleCheck {
	
	// Single instance of the class
	private volatile static SingletonLazyDoubleCheck sc = null;
	
	// Private constructor (prevents object creation outside of the class)
	private SingletonLazyDoubleCheck() {}
	
	/*
	 * First check to see if an instance is created, and if not, then we synchronize
	 * This way, we only synchronize the first time.
	 */
	public static SingletonLazyDoubleCheck getInstance() {
		if( sc == null ) {
			synchronized (SingletonLazyDoubleCheck.class) {
				if( sc == null ) {
					sc = new SingletonLazyDoubleCheck();
				}
			}
		}
		return sc;
	}

}
