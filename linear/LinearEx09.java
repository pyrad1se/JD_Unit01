package by.htp.tasks.linear;
/* Вычислить значение выражения 
 * по формуле (все переменные принимают действительные значения):
 * (a / c) * (b / d) - ((a * b) - c) / (c * d)
 */
public class LinearEx09 {
	public static void main(String[] args) {
		double a, b, c, d;
		a = 7;
		b = 4;
		c = 9;
		d = 8;
		
		double result = (a / c) * (b / d) - ((a * b) - c) / (c * d);
		
		System.out.println(result);
	}
}
