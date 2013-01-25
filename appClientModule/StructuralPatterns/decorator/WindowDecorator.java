package StructuralPatterns.decorator;

//추상 데코레이터 클래스 - Window를 구현하고 있음.
public class WindowDecorator implements Window {

	//꾸며지는 대상 윈도우
	protected Window decoratedWindow;

	public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
	
	@Override
	public void draw() {
		//원본 메소드를 구현
		decoratedWindow.draw();
	}

	@Override
	public String getDescription() {
		//원본 메소드를 구현.
		return decoratedWindow.getDescription();
	}

}
