package by.htp.tasks.conditions;
/*Определить, делителем каких чисел а, b, с является число k.*/

public class ConditionsEx20 {
	
	public static void main(String[] args) {
		
		double a = 300;
		double b = 24;
		double c = 9999;
		
		double k = 4;
		
		System.out.println("k является делителем следующих чисел: ");
		
		if (a % k == 0) {
			System.out.println(a);
		}
		
		if (b % k == 0) {
			System.out.println(b);
		}
		
		if (c % k == 0) {
			System.out.println(c);
		}
	}
}
