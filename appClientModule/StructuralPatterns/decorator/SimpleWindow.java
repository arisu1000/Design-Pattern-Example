package StructuralPatterns.decorator;

//스크롤바가 없는 간단한 윈도우의 구현
public class SimpleWindow implements Window {

	@Override
	public void draw() {
		// window를 그림.
	}

	@Override
	public String getDescription() {
		return "simple window";
	}

}
