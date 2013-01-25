package StructuralPatterns.decorator;

//수평 스크롤바 기능을 추가하는 두번째 실 데코레이터
public class HorizontalScrollBarDecorator extends WindowDecorator {

	public HorizontalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}
	

	@Override
    public void draw() {
        decoratedWindow.draw();
        drawHorizontalScrollBar();
    }
 
    private void drawHorizontalScrollBar() {
        // 수평 스크롤바를 그림
    }
 
    @Override
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }


}
