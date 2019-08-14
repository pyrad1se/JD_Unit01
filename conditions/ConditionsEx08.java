package by.htp.tasks.conditions;
// Составить программу нахождения наименьшего из квадратов двух чисел а и b.
public class ConditionsEx08 {
	public static void main(String[] args) {
		double a = 3;
		double b = 7;
		
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		
		if (a2 < b2) {
			System.out.println("Квадрат a меньше");
		} else {
			System.out.println("Квадрат b меньше");
		}
	}

}
