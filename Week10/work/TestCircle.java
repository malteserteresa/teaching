import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCircle {

	Circle circle1 = new Circle(4);

	@Test
	public void testCircleArea() {
		double area = circle1.circleArea();
		assertTrue(50 == Math.round(area));
	}

	@Test
	public void testCirclePerimeter() {
		double perimeter = circle1.circlePerimeter();
		assertTrue(25 == Math.round(perimeter));
	}

	@Test
	public void testCircleHasCorrectRadius() {
		double radius = circle1.radius;
		assertTrue(4 == radius);
	}
}
