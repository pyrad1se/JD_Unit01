package by.htp.tasks.conditions;
// Составить программу, которая определит площадь какого круга меньше.
public class ConditionsEx10 {
	public static void main(String[] args) {
		double r1 = 500;
		double r2 = 909;
		
		double pl1 = Math.PI * r1 * r1;
		double pl2 = Math.PI * r2 * r2;
		
		if (pl1 < pl2) {
			System.out.println("Площадь первого круга меньше");
		} else {
			System.out.println("Площадь второго круга меньше");
		}
	}

}
