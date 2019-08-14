package by.htp.tasks.conditions;
/* Даны три действительных числа. Возвести в квадрат 
 * те из них, значения которых неотрицательны, и в четвертую
степень — отрицательные. */

public class ConditionsEx12 {
	public static void main(String[] args) {
		double a = -2;
		double b = -100;
		double c = 42;
		
		if (a < 0) {
			a = Math.pow(a, 4);
		} else { a = Math.pow(a, 2);
		}
		
		if (b < 0) {
			b = Math.pow(b, 4);
		} else { b = Math.pow(b, 2);
		}
		
		if (c < 0) {
			c = Math.pow(c, 4);
		} else { c = Math.pow(c, 2);
		}
		
		System.out.println("Новые значения чисел:\n" + a + "\n"+ b + "\n" + c);
		
		
	}
}
