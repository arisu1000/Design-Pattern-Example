package StructuralPatterns.composite;

import java.util.List;
import java.util.ArrayList;

public class CompositeGraphic implements Graphic {

	//�ڽ� �׷��ȵ��� �÷���
	private List<Graphic> childGraphics = new ArrayList<Graphic>();
	
	//�׷����� �����.
	@Override
	public void print() {
		for (Graphic graphic : childGraphics){
			graphic.print();
		}

	}

	//�ش� �׷�����  �÷��ǿ� �߰���.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
 
    //�ش� �׷����� �÷��ǿ��� ������.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
