package StructuralPatterns.composite;

//Ŭ���̾�Ʈ ���α׷�
public class Program {

	
	public static void main(String[] args) {
		//4���� ellipses ��ü�� �ʱ�ȭ��.
        Ellipse ellipse1 = new Ellipse("1");
        Ellipse ellipse2 = new Ellipse("2");
        Ellipse ellipse3 = new Ellipse("3");
        Ellipse ellipse4 = new Ellipse("4");
 
        //3���� composite �׷��ȵ��� �ʱ�ȭ��.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
 
        //�׷��ȵ��� ������.
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);
 
        graphic2.add(ellipse4);
 
        graphic.add(graphic1);
        graphic.add(graphic2);
 
        //��ü �׷��ȵ��� �����.("Ellipse"�� 4�� ��µ�.)
        graphic.print();

	}

}
