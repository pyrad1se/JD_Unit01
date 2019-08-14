package by.htp.tasks.loops;
/*Вычислить значения функции на отрезке [а,b] c шагом h:
*/
public class LoopsEx07 {
	public static void main(String[] args) {
		double x, y;
		double a = -2;
		double b = 7;
		double h = 2;
		
		for (x = a; x <= b - h; x += h) {
			System.out.println("x = " + x);
			if ((x <= 7) & (x >= -2)) {
				y = x;
				System.out.println("y = " + y);
			}
		}

	}

}
