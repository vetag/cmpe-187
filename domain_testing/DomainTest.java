/**
 * This assignment will utilize Domain Testing. Dony by Kevin Ma, Rich Chau, Ryan Ly
 * Sample program idea provided by guru99.
 * 
 * @see <a href = "https://www.guru99.com/domain-testing.html">
 */

package domainTesting;

public class DomainTest {

	/*
	 * Method assigns the person to their competition subject based on their
	 * gender and age.
	 */
	public String competitionAssignment(String gender, int age) {

		if (gender.compareTo("boy") != 0 && gender.compareTo("girl") != 0) {
			System.out.println("Invalid gender");
			return null;
		}

		if (age <= 5 || age > 15) {
			if (age <= 5) {
				return ("Rhymes");
			} else {
				return ("Poetry");
			}
		} else {
			if (gender.equals("boy")) {
				if (age > 5 && age <= 10) {
					return ("Storytelling");
				} else {
					return ("Quiz");
				}
			} else {
				if (age > 5 && age <= 10) {
					return ("Drawing");
				} else {
					return ("Essay");
				}
			}
		}

	}

	public static void main(String args[]) {
		DomainTest test = new DomainTest();

		System.out.println("\nTT Domain:");
		System.out.println(test.competitionAssignment("boy", 5));
		System.out.println(test.competitionAssignment("girl", 6));
		System.out.println(test.competitionAssignment("girl", 5));

		System.out.println("\nTF Domain:");
		System.out.println(test.competitionAssignment("boy", 15));
		System.out.println(test.competitionAssignment("girl", 16));
		System.out.println(test.competitionAssignment("girl", 15));

		System.out.println("\nFTT Domain:");
		System.out.println(test.competitionAssignment("girl", 10));
		System.out.println(test.competitionAssignment("girl", 5));
		System.out.println(test.competitionAssignment("girl", 8));

		System.out.println("\nFTF Domain:");
		System.out.println(test.competitionAssignment("girl", 10));
		System.out.println(test.competitionAssignment("girl", 12));
		System.out.println(test.competitionAssignment("girl", 15));

		System.out.println("\nFFT Domain:");
		System.out.println(test.competitionAssignment("boy", 10));
		System.out.println(test.competitionAssignment("boy", 7));
		System.out.println(test.competitionAssignment("boy", 5));

		System.out.println("\nFFF Domain:");
		System.out.println(test.competitionAssignment("boy", 10));
		System.out.println(test.competitionAssignment("boy", 13));
		System.out.println(test.competitionAssignment("boy", 15));
	}