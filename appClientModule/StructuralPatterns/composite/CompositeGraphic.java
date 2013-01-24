package StructuralPatterns.composite;

import java.util.List;
import java.util.ArrayList;

public class CompositeGraphic implements Graphic {

	//자식 그래픽들의 컬렉션
	private List<Graphic> childGraphics = new ArrayList<Graphic>();
	
	//그래픽을 출력함.
	@Override
	public void print() {
		for (Graphic graphic : childGraphics){
			graphic.print();
		}

	}

	//해당 그래픽을  컬렉션에 추가함.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
 
    //해당 그래픽을 컬렉션에서 제거함.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
