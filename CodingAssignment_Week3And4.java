package classWeek04;

public class CodingAssignment_Week3And4 {

	public static void main(String[] args) {
		
		//Step 1-A
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

		int answer = ages[0] - ages[ages.length - 1];

		System.out.println("The answer is " + answer + "!");
		
		//Step 1-B
		int[] newAges = {120, 3, 9, 23, 64, 2, 8, 28, 93};

		int newAnswer = newAges[0] - newAges[newAges.length - 1];

		System.out.println("The answer is " + newAnswer + "!");
		
		//Step 1-C
		double total = 0;
		for (int i = 0; i < newAges.length; i++) {
			total += newAges[i];
		}
		double average = total / newAges.length;
		System.out.println("The average age for newAge is " + average + "!");
		
		//Step 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Step 2-A
		double sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		double lengthAverage = sum / names.length;
		System.out.println("The average number of letter per name is " + lengthAverage + "!");
		
		//Step 2-B
		String allTheNames = "";
		for (int i = 0; i < names.length; i++) {
			allTheNames += names[i] + " ";
		}
		System.out.println(allTheNames);
		
		//Step 3
		//answer = array[array.length-1]
		
		//Step 4
		//Answer = array[0]
		
		//Step 5
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//Step 6
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of all the elements is " + sum + "!");
		
		//Step 9
		System.out.println("The answer is " + sumOfAll(newAges));
		//Step 10
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(getAverage(doubles));
		//Step 11
		double[] oneDouble = {45.7, 30.2, 67.3};
		double[] twoDouble = {45.7, 30.2, 9};
		System.out.println(arrayVsArray(oneDouble, twoDouble));
		//Step 12
		boolean isHotOutside = true;
		double moneyInPocket = 20.00;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		//Step 13
		birthdaySong("Tom Atoe");
		birthdaySong("John Johnson");
		birthdaySong("Sam Jackson");
	}
	//Step 7
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
	//Step 8
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
		}
	
	//Step 9
	public static boolean sumOfAll(int[] array) {
		int sum = 0;
		for (int number : array) {
			if (number > 100) {
				return true;
			}
		}
		return false;
	}
	
	//Step 10
	public static double getAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	//Step 11
	public static boolean arrayVsArray(double[] one, double[] two) {
		return getAverage(one) > getAverage(two); 
	}
	
	//Step 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean answer = true;
		double money = 10.50;
		if (answer) {
		}else
		if (money > 10.50) {
		}
		return isHotOutside;
	}
	
	//Step 13
	public static void birthdaySong(String name) {
		System.out.println("Happy birthday to you, happy birthday dear " + name + "! Happy birthday to you!");
	}
}
