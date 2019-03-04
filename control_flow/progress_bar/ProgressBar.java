package progress_bar;

import java.awt.geom.Arc2D;
import java.util.Scanner;

/**
 * Progress Bar class to determine if given point within a specified region is
 * RED or BLUE
 * 
 * @author Kevin Ma, Rich Chau, Ryan Ly
 *
 */
public class ProgressBar {
	private int progress;
	private int xValue;
	private int yValue;
	private Arc2D arc;

	public ProgressBar(int userInput, double x, double y) {
		progress = userInput;
		setxValue((int) x);
		setyValue((int) y);
		arc = new Arc2D.Float(0.0f, 0.0f, 100, 100, 90, progress * 360 / 100, Arc2D.PIE);
	}

	public int getxValue() {
		return xValue;
	}

	public void setxValue(int xValue) {
		this.xValue = xValue;
	}

	public int getyValue() {
		return yValue;
	}

	public void setyValue(int yValue) {
		this.yValue = yValue;
	}

	/*
	 * This method checks if the x and y value are inside the region specified
	 * 
	 * @param x takes in x coordinate as a double
	 * 
	 * @param y takes in y coordinate as a double
	 */
	public boolean isValid(double x, double y) {
		if (arc.contains(x, y) == true) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Initialize variables to 0
		int percentage = 0;
		double xValue = 0;
		double yValue = 0;
		Scanner in = new Scanner(System.in);

		// Get percentage from user input
		do {
			try {
				System.out.print("Input progress percentage: ");
				percentage = in.nextInt();
				if (percentage < 0 || percentage > 100) {
					System.out.println("Please enter a percentage between 0 and 100");
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid integer");
				System.out.println();
				in.nextLine();
			}
		} while (percentage < 0 || percentage > 100);

		// Get x and y coordinates from user input
		do {
			try {
				System.out.print("Enter x-coordinate: ");
				xValue = in.nextDouble();
				System.out.print("Enter y-coordinate: ");
				yValue = in.nextDouble();
				yValue = 100 - yValue;

				if (xValue < 0 || xValue > 100 || yValue < 0 || yValue > 100) {
					System.out.println("Please enter x or y coordinate between 0 and 100");
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid Double or Integer ");
				System.out.println();
				in.nextLine();
			}
		} while (xValue < 0 || xValue > 100 || yValue < 0 || yValue > 100);
		in.close();

		ProgressBar bar = new ProgressBar(percentage, xValue, yValue);
		if (bar.isValid(xValue, yValue)) {
			System.out.println("(" + xValue + ", " + yValue + ") is Red");
		} else {
			System.out.println("(" + xValue + ", " + yValue + ") is Blue");
		}
	}
}
