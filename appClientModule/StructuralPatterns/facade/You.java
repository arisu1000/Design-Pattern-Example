package StructuralPatterns.facade;

//클라이언트
public class You {

	public static void main(String[] args) {
		Computer facade = new Computer();
		facade.startComputer();
	}

}
