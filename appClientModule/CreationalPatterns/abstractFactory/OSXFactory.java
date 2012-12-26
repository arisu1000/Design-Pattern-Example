package CreationalPatterns.abstractFactory;

public class OSXFactory implements GUIFactory{
	public Button createButton(){
		return new OSXButton();
	}
}
