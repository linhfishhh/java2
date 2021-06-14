package circle1;

public class cylinder extends circle{
	private double height;
	public cylinder() {}
	public cylinder(double height) {
		this.height=height;
	}
	public cylinder(double radius,String color,double height) {
		super(radius, color);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double thetich() {
		return super.getArea()*this.height;
	}
	@Override
	public String toString() {
		return "cylinder [height=" + height +" Sub class of "+ super.toString()+"The tich= "+thetich()+ "]";
	}
	
}
