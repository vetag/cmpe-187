import java.util.HashMap;

public class EquivalentT {
	
	private HashMap<String, Double> fares;
	
	public EquivalentT() {
		this.fares = new HashMap<String, Double>();
		this.fares.put("Manchester", 42.30);
		this.fares.put("Liverpool", 42.30);
		this.fares.put("Warrington", 42.30);
		this.fares.put("Glasgow", 61.80);
		this.fares.put("Edinburgh", 61.80);
		this.fares.put("Cardiff", 31.10);
		this.fares.put("Swansea", 31.10);
		this.fares.put("Newport", 31.10);
	}
	
	public int getDiscount(int age) {
		int discount = 0;
		if (age >= 0 && age <= 4) {
			discount = 100;
		}
		else if (age >= 5 && age <= 15) {
			discount = 50;
		}
		else if (age >= 16 && age <= 63 ) {
			discount = 0;
		}
		else if (age >= 64) {
			discount = 25;
		}
		return discount;
	}
	
	public Double getFarePrice(String name, int age, String destination) {
		Double farePrice = 0.00;
		if (age >= 0 && age <= 4) {
			farePrice = 0.00;
		}
		else if (destination.equals("Manchester")) {
			farePrice = this.fares.get("Manchester") - (this.fares.get("Manchester") * getDiscount(age) / 100);
		}
		else if (destination.equals("Liverpool")) {
			farePrice = this.fares.get("Liverpool") - (this.fares.get("Liverpool") * getDiscount(age) / 100);
		}
		else if (destination.equals("Warrington")) {
			farePrice = this.fares.get("Warrington") - (this.fares.get("Warrington") * getDiscount(age) / 100);
		}
		else if (destination.equals("Glasgow")) {
			farePrice = this.fares.get("Glasgow") - (this.fares.get("Glasgow") * getDiscount(age) / 100);
		}
		else if (destination.equals("Edinburgh")) {
			farePrice = this.fares.get("Edinburgh") - (this.fares.get("Edinburgh") * getDiscount(age) / 100);
		}
		else if (destination.equals("Cardiff")) {
			farePrice = this.fares.get("Cardiff") - (this.fares.get("Cardiff") * getDiscount(age) / 100);
		}
		else if (destination.equals("Swansea")) {
			farePrice = this.fares.get("Swansea") - (this.fares.get("Swansea") * getDiscount(age) / 100);
		}
		else if (destination.equals("Newport")) {
			farePrice = this.fares.get("Newport") - (this.fares.get("Newport") * getDiscount(age) / 100);
		}
		return farePrice;
	}
	
	public static void main(String[] args) {
		EquivalentT main = new EquivalentT();
		System.out.println(main.getFarePrice("Tony Stark", 0, "Manchester"));
		System.out.println(main.getFarePrice("Steve Rogers", 4, "Liverpool"));
		System.out.println(main.getFarePrice("Natasha Romanoff", 5, "Warrington"));
		System.out.println(main.getFarePrice("Peter Parker", 15, "Glasgow"));
		System.out.println(main.getFarePrice("Nick Fury", 16, "Edinburgh"));
		System.out.println(main.getFarePrice("Bruce Banner", 63, "Cardiff"));
		System.out.println(main.getFarePrice("Thor Odinson", 64, "Swansea"));
		System.out.println(main.getFarePrice("Clinton Barton", 40, "Newport"));
		System.out.println(main.getFarePrice("Scott Lang", -1, "Liverpool"));
		System.out.println(main.getFarePrice("Hope Dyne", 1, "Manchester"));
		System.out.println(main.getFarePrice("Wanda Maximoff", 3, "Glasgow"));
		System.out.println(main.getFarePrice("Piertro Maximoff", 2, "Cardiff"));
		System.out.println(main.getFarePrice("T'Challa", 6, "Liverpool"));
		System.out.println(main.getFarePrice("Carol Danvers", 10, "Edinburgh"));
		System.out.println(main.getFarePrice("Samuel Wilson", 13, "Swansea"));
		System.out.println(main.getFarePrice("James Rhodes", 26, "Warrington"));
		System.out.println(main.getFarePrice("Peter Quill", 51, "Glasgow"));
		System.out.println(main.getFarePrice("Gamora", 62, "Newport"));
		System.out.println(main.getFarePrice("Rocket Racoon", 68, "Manchester"));
		System.out.println(main.getFarePrice("Groot", 75, "Edinburgh"));
		System.out.println(main.getFarePrice("Drax", 94, "Swansea"));
		System.out.println(main.getFarePrice("Matthew Murdock", -15, "Liverpool"));
		System.out.println(main.getFarePrice("", 20, "Newport"));
		
	}
	
}
