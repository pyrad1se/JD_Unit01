package by.htp.tasks.loops;
/*Вычислить значения функции на отрезке [а,b] c шагом h:*/
public class LoopsEx08 {
	public static void main(String[] args) {
		double x, y;
		double a = -14;
		double b = 16;
		double h = 3;
		double c = 2;
		
		for (x = a; x <= b; x += h) {
			System.out.println("x = " + x);
			if ((x <= b) & (x >= a)) {
				y = (x + c) * 2;
				y = (x - c) + 6;
				System.out.println("y = " + y);
			}
		}
	}

}
