package by.htp.tasks.linear;
/* Три сопротивления R1 R2, и 
 * R3 соединены параллельно. Найдите сопротивление соединения*/

public class LinearEx30 {
	public static void main(String[] args) {
		double result;
		double r1 = 200;
		double r2 = 350;
		double r3 = 900;
		
		double r_obr = 1 / r1 + 1 / r2 + 1 / r3;
		
		result = Math.pow(r_obr, -1);
		
		System.out.println("Сопротивление соединения равно " + result);
		
	}
}
