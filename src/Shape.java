// 60171672
// »≤¡ÿ«œ
abstract public class Shape implements Drawable {
	private double x;
	private double y;
	private double width;
	private double height;
	// private
	
	public double getX() {return x;}
	public void setX(int x) {this.x = x;}
	public double getY() {return y;}
	public void setY(int y) {this.y = y;}
	public double getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public double getLength() {return height;}
	public void setLength(int height) {this.height = height;}
	public double getArea() {return width*height;}
	public double getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	// getter setter
	
	public void draw() {
		// implements Drawable
	}
}

class Rectangle extends Shape {
	public double getArea() {return getWidth()*getHeight();}
	public double getLength() {return (getWidth()+getHeight())*2;}
	// getter setter , override
	
	public Rectangle() {}
	// Default Constructor
	public Rectangle(int x, int y, int width, int height) {
	// constructor Rectangle(x,y,width,height)
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}

	public void draw() {
		// override draw
		System.out.printf("Rectangle (%.1f , %.1f) - (%.1f, %.1f)\n", getX(), getY(), getX()+getWidth(), getY()+getHeight());
	}
}

class Circle extends Shape {
	private double radius;
	// private

	public double getRadius() {return radius;}
	public void setRadius(int radius) {this.radius = radius;}
	public double getArea() {return (Math.pow(getRadius(),2) * Math.PI);}
	public double getLength() {return 2*getRadius()*Math.PI;}
	// getter setter , override
	
	public Circle() {}
	// Default Constructor
	public Circle(int x, int y, int radius){
	// constructor Circle(x,y,radius)
		setX(x);
		setY(y);
		setRadius(radius);
	}
	
	public void draw() {
	// override
		System.out.printf("Circle center (%.1f , %.1f) - radius (%.1f)\n", getX(), getY(), getRadius());
	}
}
