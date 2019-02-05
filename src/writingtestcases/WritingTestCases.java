package writingtestcases;

public class WritingTestCases {

	/*
	 * Constructor for class, ints not used
	 */
	public WritingTestCases() {
		int x;
		int y;
		int z;
	}

	/*
	 * Tests if the numbers given form a triangle or not. If so, returns if the triangle is equilateral, isosceles, or scalar with a boolean of true.
	 * If numbers do not form a triangle, returns that they do not form a triangle and a boolean of false.
	 * @param x the x side of triangle
	 * @param y the y side of triangle
	 * @param z the z side of triangle
	 */
	public boolean TriangleOrNot(int x, int y, int z) {
		boolean test = false;
		int xySides = x + y;
		int zySides = z + y;
		int zxSides = z + x;
		if(xySides > z && zySides > x && zxSides > y) {
			if(x == y && x == z) {
				System.out.println("The triangle is equilateral");
				test = true;
			}
			else if(x == y || x == z) {
				System.out.println("The triangle is isosceles");
				test = true;
			}
			else if(x != y && x != z && y != z) {
				System.out.println("The triangle is scalar");
				test = true;
			}
		} else {
			System.out.println("This is not a triangle");
			test = false;
		}
		return test;
	}
	
	/*
	 * Tester method
	 * Change the numbers inside TriangleOrNot() to test triangles. First number is x, second number is y, third number is z
	 */
	public static void main(String[] args) {
		System.out.println(new WritingTestCases().TriangleOrNot(11, 1, 12));
	}
}