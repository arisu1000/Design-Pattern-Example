package StructuralPatterns.decorator;


public class DecoratedWindowTest {

	
	public static void main(String[] args) {
		// 수평, 수직 스크롤바가 추가된 Window를 생성함.
        Window decoratedWindow = new HorizontalScrollBarDecorator (
                new VerticalScrollBarDecorator(new SimpleWindow()));
 
        // Window의 설명을 출력함.
        System.out.println(decoratedWindow.getDescription());

	}

}
