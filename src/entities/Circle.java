package entities;

public class Circle extends Shape {

	private Double radius;
	static final double PI = 3.141592653589793;

	public Circle() {
	}

	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI * radius * radius;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%.2f %n", area()));
		return sb.toString();
	}
	
}
