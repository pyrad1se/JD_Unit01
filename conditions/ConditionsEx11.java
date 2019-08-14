package by.htp.tasks.conditions;
/*Составить программу, которая определит 
 * площадь какого треугольника больше.
 */
public class ConditionsEx11 {
	public static void main(String[] args) {
		double a1 = 44;
		double a2 = 22;
		
		double h1 = 17;
		double h2= 18;
		
		double pl1 = (a1 / 2) * h1;
		double pl2 = (a2 / 2) * h2;
		
		if (pl1 > pl2) {
			System.out.println("Площадь первого треугольника больше");
		} else {
			System.out.println("Площадь второго треугольника больше");
		}
	}
}
