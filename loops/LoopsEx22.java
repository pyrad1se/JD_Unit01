package by.htp.tasks.loops;
/*Составить программу для вычисления значений функции F(x) на отрезке
 *  [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, 
второй - соответствующие
значения функции:
( ) sin ( )*/
public class LoopsEx22 {
	public static void main(String[] args) {
		int a = -40;
		int b = 34;
		double x, fx;
		int h = 4;
		
		for (x = a; x <= b; x += h) {
			System.out.print("x = " + x + "   ");
			fx = Math.sin(x) * Math.sin(x);
			System.out.println("f(x) = " + fx);
		}
	}

}
