package StructuralPatterns.decorator;

//���� ��ũ�ѹ� ����� �߰��ϴ� �ι�° �� ���ڷ�����
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
        // ���� ��ũ�ѹٸ� �׸�
    }
 
    @Override
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }


}
