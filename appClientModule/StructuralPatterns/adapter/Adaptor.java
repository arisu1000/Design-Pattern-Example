package StructuralPatterns.adapter;

public class Adaptor {
	private Adaptee adaptee;
	
	public int getNumber(){
		adaptee = new Adaptee();
		
		//String�� �����͸� Int�� �����ͷ� ��ȯ��.
		return Integer.valueOf(adaptee.getString());
	}
}
