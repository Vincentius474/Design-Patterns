<h1>Singleton Pattern</h1>
Sometimes it’s important for some classes to have exactly one instance. There are many objects we only need one instance
of them and if we, instantiate more than one, we’ll run into all sorts of problems like incorrect program behavior, overuse of
resources, or inconsistent results.

You may require only one object of a class, for example, when you are a creating the context of an application, or a thread
manageable pool, registry settings, a driver to connect to the input or output console etc. More than one object of that type
clearly will cause inconsistency to your program.

The Singleton Pattern ensures that a class has only one instance, and provides a global point of access to it. However, although
the Singleton is the simplest in terms of its class diagram because there is only one single class, its implementation is a bit trickier

** SingletonEager.java **
This is our singleton class which makes sure that only one object of the class gets created and even if there are several requests,
only the same instantiated object will be returned.

The one problem with this approach is that, the object would get created as soon as the class gets loaded into the JVM. If the
object is never requested, there would be an object useless inside the memory.

It’s always a good approach that an object should get created when it is required. So, we will create an object on the first call and
then will return the same object on other successive calls.

** SingletonLazy.java **
In the getInstance() method, we check if the static variable sc is null, then instantiate the object and return it. So, on the
first call when sc would be null the object gets created and on the next successive calls it will return the same object.

This surely looks good, but this code will fail in a multi-threaded environment. Imagine two threads concurrently
accessing the class, thread t1 gives the first call to the getInstance() method, it checks if the static variable sc is null and
then gets interrupted due to some reason. Another thread t2 calls the getInstance() method successfully passes the if check
and instantiates the object. Then, thread t1 gets awake and it also creates the object. At this time, there would be two objects of
this class.

** SingletonMultithreaded.java **
To avoid the problem in SingletonLazy, we will use the synchronized keyword to the getInstance() method. With this way, we force every thread
to wait its turn before it can enter the method. So, no two threads will enter the method at the same time. 

The synchronized keyword comes with a price, it will decrease the performance, but if the call to the getInstance() method isn’t causing a substantial overhead for your application, forget about it.

** SingletonLazyDoubleCheck.java **
But if you want to use synchronization form SingletonMultithreaded, there is another technique known as “double-checked locking” to reduce the use of synchronization. With the double-checked locking, we first check to see if an instance is created, and if not, then we synchronize.
This way, we only synchronize the first time.

** Singleton.java**
Apart from this, there are some other ways to break the singleton pattern. If the class is serializable, clonable, it can be break by reflection
and also if, the class is loaded by multiple class loaders.

** Using Enum **

Although we can use all these techniques, there is one simple and easier way of creating a singleton class. You
can create a singleton class using enums.

```
package patterns.singletonpattern;

public class SingletoneEnum {
	public enum SingleEnum{
		SINGLETON_ENUM;
	}
}
```

These following pointers ensures that no instance of an enum exists beyond the one defined by the enum constants.

- Enum gets loaded statically, it is thread-safe. 
- The clone method in Enum is final which ensures that enum constants never get cloned. 
- Enum is inherently serializable, the serialization mechanism ensures that duplicate instances are never created as a result of deserialization. - - Instantiation using reflection is also prohibited. 



**When to use Singleton**

- There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point.
- When the sole instance should be extensible by sub-classing, and clients should be able to use an extended instance without
modifying their code.