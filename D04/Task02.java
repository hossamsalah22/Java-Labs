import java.util.ArrayList;

abstract class Shape{
	public abstract void draw();
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Rect");
	}
}

public class Task02 {
	public static void drawShapes (ArrayList<? extends Shape> shapes) {
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
	
	public static void main (String args[]) {
		ArrayList<Rectangle> rectsList = new ArrayList<Rectangle>();
		rectsList.add(new Rectangle());
        rectsList.add(new Rectangle());
		ArrayList<Circle> circlesList = new ArrayList<Circle>();
        circlesList.add(new Circle());
		circlesList.add(new Circle());
		
		drawShapes(circlesList);
		drawShapes(rectsList);
	}
}