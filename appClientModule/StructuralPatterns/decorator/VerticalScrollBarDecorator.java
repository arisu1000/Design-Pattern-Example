package StructuralPatterns.decorator;

//���� ��ũ�ѹ� ����� �߰��ϴ� ù��° �� ���ڷ�����
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
        // ���� ��ũ�ѹٸ� �׸�.
    }
 
    @Override
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }

}
