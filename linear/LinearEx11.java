package by.htp.tasks.linear;
/* Вычислить периметр и площадь 
 * прямоугольного треугольника по длинам а и b двух катетов.
 */
public class LinearEx11 {
	public static void main(String[] args) {
		double a = 5;
		double b = 8;
		double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		
		double per = a + b + c;
		double pl = (a * b) / 2;
		
		System.out.println("Периметр равен: " + per);
		System.out.println("Площадь равна: " + pl);
	}
}
