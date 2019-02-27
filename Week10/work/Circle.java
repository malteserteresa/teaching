
public class Circle {

	public double radius;

	public Circle(int neededRadius) {
		radius = neededRadius;
	}

	public double circleArea() {
		return Math.PI * radius * radius;
	}

	public double circlePerimeter() {
		return Math.PI * 2 * radius;
	}

	public String toString() {
		return "Circle with radius '" + radius + "'  area '" + Math.round(circleArea()) + "' and perimeter '"
				+ Math.round(circlePerimeter()) + "'";
	}
}
