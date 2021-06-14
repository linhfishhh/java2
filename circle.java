package circle1;

public class circle {
	private double radius;
	private String color;
	public circle() {}
	public circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	@Override
	public String toString() {
		return "circle [radius=" + radius + ", color= " + color + " Perimeter= "+getPerimeter()+" Area = "+getArea()+"]";
	}
	
}
