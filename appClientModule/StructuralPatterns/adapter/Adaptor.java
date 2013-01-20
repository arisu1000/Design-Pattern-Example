package StructuralPatterns.adapter;

public class Adaptor {
	private Adaptee adaptee;
	
	public int getNumber(){
		adaptee = new Adaptee();
		
		//String형 데이터를 Int형 데이터로 변환함.
		return Integer.valueOf(adaptee.getString());
	}
}
