package StructuralPatterns.adapter;

public class Client {

	public static void main(String[] args) {
		Adaptor adaptor = new Adaptor();
		int result = adaptor.getNumber();
		
		System.out.println(result);
		
	}

}
