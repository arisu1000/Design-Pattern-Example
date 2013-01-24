package StructuralPatterns.composite;

// 리프(leaf)
public class Ellipse implements Graphic {

	private String name = null;
	
	Ellipse(String name){
		this.name = name;
	}
	
	//그래픽을 출력함.
	@Override
	public void print() {
		System.out.println("Ellipse : " + name);
	}

}
