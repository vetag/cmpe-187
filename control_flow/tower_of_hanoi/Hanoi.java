package tower_of_hanoi;

import java.util.Scanner;

/**
 * Recursive method for solving Tower of Hanoi
 * Used to demonstrate control flow testing for CMPE-187
 * @author Kevin Ma, Rich Chau, Ryan Ly
 *
 */
public class Hanoi {
	/*
	 * This method recursively solves the Tower of Hanoi problem
	 * @param n 			number of n discs
	 * @param start 		first rod
	 * @param middle 	middle rod
	 * @param end 		last rod
	 */
	public void solve(int n, char start, char middle, char end) {
		if (n == 1) {
			System.out.println("Disc 1 from Rod " + start + " -> " + "Rod " + end);
		} else {
			solve(n - 1, start, end, middle); // Moves (n-1) disks from start to middle
			System.out.println("Disc " + n + " from Rod " + start + " -> " + "Rod " + end); // Move last disc from start to end
			solve(n - 1, middle, start, end); // Moves (n-1) disks from middle to end

		}
	}

	public static void main(String[] args) {
		Hanoi towers = new Hanoi();
		System.out.print("Enter number of discs: ");
		Scanner scanner = new Scanner(System.in);
		int discs = scanner.nextInt();
		towers.solve(discs, 'A', 'B', 'C');
		scanner.close();
	}
}