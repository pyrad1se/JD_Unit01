package by.htp.tasks.conditions;
/*Даны действительные числа а,b,с. Удвоить эти числа, 
 * если а > b > с, и заменить их абсолютными значениями, если
это не так.*/
public class ConditionsEx30 {
	public static void main(String[] args) {
		double a = 2.5;
		double b = 3.8;
		double c = 2.9;
		
		if (a > b & b > c) {
			a *= a;
			b *= b;
			c *= c;
		} else {
			a = (int) a;
			b = (int) b;
			c = (int) c;
		}
		
		System.out.println("a:" + a + "\tb:" + b + "\tc:" + c);
	}
}
