package StructuralPatterns.composite;

// ����(leaf)
public class Ellipse implements Graphic {

	private String name = null;
	
	Ellipse(String name){
		this.name = name;
	}
	
	//�׷����� �����.
	@Override
	public void print() {
		System.out.println("Ellipse : " + name);
	}

}
