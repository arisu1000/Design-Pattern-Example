package CreationalPatterns.abstractFactory;

class Application {
	public Application(GUIFactory factory){
		Button button = factory.createButton();
		button.paint();
	}
}
