package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;
	private double x;
	private double y;

	public Rectangle(double initWidth, double initLength,  double initX, double initY) {
		width= initWidth;
		length=initLength;
		x= initX;
		y= initY;
	}
	public double area () {
		return length * width;
	}
	public double perimeter () {
		return (length * 2) + (width * 2);
	}
	public void drawRectangle() {
		StdDraw.rectangle(x,y,width/2,length/2);
	}
	public boolean isSquare() {
		if (width==length) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[]args) {
		Rectangle r1= new Rectangle (0.4, 0.2, 0.5, 0.5);
		r1.drawRectangle();
	}
}
