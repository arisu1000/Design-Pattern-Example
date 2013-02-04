package StructuralPatterns.decorator;

//수직 스크롤바 기능을 추가하는 첫번째 실 데코레이터
public class VerticalScrollBarDecorator extends WindowDecorator {

	public VerticalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}


	@Override
    public void draw() {
        decoratedWindow.draw();
        drawVerticalScrollBar();
    }
 
    private void drawVerticalScrollBar() {
        // 수직 스크롤바를 그림.
    }
 
    @Override
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }

}
