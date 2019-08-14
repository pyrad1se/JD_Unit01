package by.htp.tasks.linear;
/* Даны два числа. Найти среднее арифметическое кубов этих чисел и 
 * среднее геометрическое модулей этих чисел.
 */
public class LinearEx17 {
	public static void main(String[] args) {
		double num1 = 344;
		double num2 = -300;
		
		double num_avg_a = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
		double num_avg_b = (Math.abs(num1) * Math.abs(num2)) / 2;
		
		System.out.println("Среднее арифметическое кубов равно " + num_avg_a);
		System.out.println("Среднее геометрическое "
				+ "модулей равно " + num_avg_b);
		
	}

}
