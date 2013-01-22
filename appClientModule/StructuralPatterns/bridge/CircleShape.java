package StructuralPatterns.bridge;

//Refined Abstraction
public class CircleShape extends Shape {

	private double x, y, radius;
	
	public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
      super(drawingAPI);
      this.x = x;  this.y = y;  this.radius = radius;
   }
	
	//������, �� Implementation ���
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawingAPI.drawCircle(x, y, radius);
	}

	//�����, Abstraction ���
	@Override
	public void resizeByPercentage(double pct) {
		// TODO Auto-generated method stub
		radius *= pct;
	}

}
