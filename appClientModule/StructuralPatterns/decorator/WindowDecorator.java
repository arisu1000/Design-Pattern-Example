package StructuralPatterns.decorator;

//�߻� ���ڷ����� Ŭ���� - Window�� �����ϰ� ����.
public class WindowDecorator implements Window {

	//�ٸ����� ��� ������
	protected Window decoratedWindow;

	public WindowDecorator (Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
	
	@Override
	public void draw() {
		//���� �޼ҵ带 ����
		decoratedWindow.draw();
	}

	@Override
	public String getDescription() {
		//���� �޼ҵ带 ����.
		return decoratedWindow.getDescription();
	}

}
