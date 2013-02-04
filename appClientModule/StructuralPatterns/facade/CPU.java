package StructuralPatterns.facade;

//��ǻ�� ��ǰ
public class CPU {
	public void freeze() { 
		System.out.println("cpu freeze.");
	}
    public void jump(long position) {  
    	System.out.println("cpu jump.");
    }
    public void execute() {  
    	System.out.println("cpu execute.");
    }
}
