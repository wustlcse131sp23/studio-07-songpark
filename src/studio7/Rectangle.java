package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
		StdDraw.filledRectangle(0.5, 0.5, width/2, length/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(2, 3);
		Rectangle rectangle2 = new Rectangle(3, 3);

		rectangle.smallerThanOther(rectangle2);
		

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double area(int length, int width) {
		return length*width;
	}
	public double perimeter(int length, int width) {
		return length*2 + width*2; 
	}
	public boolean smallerThanOther (Rectangle otherRectangle) {
		
		if (this.length< otherRectangle.getLength()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean whetherSquare (int length, int width) {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}

	
}

