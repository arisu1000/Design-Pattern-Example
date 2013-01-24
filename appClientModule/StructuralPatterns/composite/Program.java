package StructuralPatterns.composite;

//클라이언트 프로그램
public class Program {

	
	public static void main(String[] args) {
		//4개의 ellipses 객체를 초기화함.
        Ellipse ellipse1 = new Ellipse("1");
        Ellipse ellipse2 = new Ellipse("2");
        Ellipse ellipse3 = new Ellipse("3");
        Ellipse ellipse4 = new Ellipse("4");
 
        //3개의 composite 그래픽들을 초기화함.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
 
        //그래픽들을 구성함.
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);
 
        graphic2.add(ellipse4);
 
        graphic.add(graphic1);
        graphic.add(graphic2);
 
        //전체 그래픽들을 출력함.("Ellipse"가 4번 출력됨.)
        graphic.print();

	}

}
