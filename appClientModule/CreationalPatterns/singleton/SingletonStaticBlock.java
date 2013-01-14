package CreationalPatterns.singleton;


/*
 * Static Block initialization
 */
public class SingletonStaticBlock {
	private static final SingletonStaticBlock instance;
	 
	  static {
	    instance = new SingletonStaticBlock();
	  }
	 
	  public static SingletonStaticBlock getInstance() {
	    return instance;
	  }
	 
	  private SingletonStaticBlock() {
	    // ...
	  }
}
