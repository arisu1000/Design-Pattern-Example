package StructuralPatterns.decorator;


public class DecoratedWindowTest {

	
	public static void main(String[] args) {
		// ����, ���� ��ũ�ѹٰ� �߰��� Window�� ������.
        Window decoratedWindow = new HorizontalScrollBarDecorator (
                new VerticalScrollBarDecorator(new SimpleWindow()));
 
        // Window�� ������ �����.
        System.out.println(decoratedWindow.getDescription());

	}

}
