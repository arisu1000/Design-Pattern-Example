package StructuralPatterns.decorator;

//��ũ�ѹٰ� ���� ������ �������� ����
public class SimpleWindow implements Window {

	@Override
	public void draw() {
		// window�� �׸�.
	}

	@Override
	public String getDescription() {
		return "simple window";
	}

}
