package writingtestcases;

public class WritingTestCases {

	/*
	 * Tests if the numbers given form a triangle or not. If so, returns if the triangle is equilateral, isosceles, or scalar with a boolean of true.
	 * If numbers do not form a triangle, returns that they do not form a triangle and a boolean of false.
	 * @param x the x side of triangle
	 * @param y the y side of triangle
	 * @param z the z side of triangle
	 * 
	 * 
	 * Uses the triangle inequality theorem which states that the sum of the side lengths of any 2 sides 
	 * of a triangle must exceed the length of the third side.
	 */
	public boolean TriangleOrNot(int x, int y, int z) {
		
		boolean test = false;
		
		if(x <= 0 || y <= 0 || z <= 0){
			System.out.println("Invalid values(less than one)");
			return test;
		}
		
		int xySides = x + y;
		int zySides = z + y;
		int zxSides = z + x;
		if((xySides > z && zySides > x && zxSides > y)) {
			if(x == y && x == z) {
				System.out.println("The triangle is equilateral");
				test = true;
			}
			else if(x == y || x == z || y == z) {
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
		System.out.println("\nTesting with x=1, y=1, z=1:");
		System.out.println(new WritingTestCases().TriangleOrNot(1, 1, 1));
		
		System.out.println("\nTesting with x=9, y=9, z=14:");
		System.out.println(new WritingTestCases().TriangleOrNot(9, 9, 14));
		
		System.out.println("\nTesting with x=20, y=1, z=20:");
		System.out.println(new WritingTestCases().TriangleOrNot(20, 1, 20));
		
		System.out.println("\nTesting with x=5, y=10, z=10:");
		System.out.println(new WritingTestCases().TriangleOrNot(5, 10, 10));
		
		System.out.println("\nTesting with x=6, y=12, z=14:");
		System.out.println(new WritingTestCases().TriangleOrNot(6, 12, 14));
		
		System.out.println("\nTesting with x=0, y=0, z=0:");
		System.out.println(new WritingTestCases().TriangleOrNot(0, 0, 0));
		
		System.out.println("\nTesting with x=-1, y=-1, z=-1:");
		System.out.println(new WritingTestCases().TriangleOrNot(-1, -1, -1));
		
		System.out.println("\nTesting with x=2, y=3, z=10:");
		System.out.println(new WritingTestCases().TriangleOrNot(2, 3, 10));
		
		System.out.println("\nTesting with x=5, y=5, z=20:");
		System.out.println(new WritingTestCases().TriangleOrNot(5, 5, 20));
		
		System.out.println("\nTesting with x=2, y=6, z=2:");
		System.out.println(new WritingTestCases().TriangleOrNot(2, 6, 2));
		
		System.out.println("\nTesting with x=30, y=15, z=15:");
		System.out.println(new WritingTestCases().TriangleOrNot(30, 15, 15));
	}
}