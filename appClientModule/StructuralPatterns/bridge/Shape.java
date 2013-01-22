package StructuralPatterns.bridge;

//Abstraction
public abstract class Shape {
	protected DrawingAPI drawingAPI;
	 
   protected Shape(DrawingAPI drawingAPI){
      this.drawingAPI = drawingAPI;
   }
	 
   public abstract void draw();                             // 저수준
   public abstract void resizeByPercentage(double pct);     // 고수준
}
