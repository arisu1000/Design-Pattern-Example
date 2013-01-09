package CreationalPatterns.abstractFactory;

public class ApplicationRunner {
	public static void main(String[] args){
		new Application(createOsSpeificFactory());
	}

	private static GUIFactory createOsSpeificFactory() {
		int sys = readFromConfigFile("OS_TYPE");
		if (sys == 1) {
			return new WinFactory();
		}else{  
			return new OSXFactory();
		}
	}

	private static int readFromConfigFile(String string) {
		return 1;
	}
}
