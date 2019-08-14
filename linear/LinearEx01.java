package by.htp.tasks.linear;

/* Даны два действительных числа х и у.
   Вычислить их сумму, разность, произведение и частное
 */
public class LinearEx01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		
		System.out.println("сумма равна " + a);
		System.out.println("разность равна " + b);
		System.out.println("произведение равно " + c);
		System.out.println("частное равно " + d);

	}

}
