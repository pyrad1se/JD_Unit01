package by.htp.tasks.linear;
/* Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
(b + sqroot(b^2 + 4 * a * c)) / 2a - a^3 * c + b^-2
*/ 
public class LinearEx08 {

	public static void main(String[] args) {
		double a = 10;
		double b = 7;
		double c = 3;
		
		double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) 
				/ 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("Значение выражения равно " + result);
	}

}
