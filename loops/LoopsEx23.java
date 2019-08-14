package by.htp.tasks.loops;
/*Составить программу для вычисления значений функции F(x) на отрезке 
 * [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента,
 второй - соответствующие
значения функции:
sin( )
2
1
3
( ) x
x
F x ctg */
public class LoopsEx23 {
	public static void main(String[] args) {
		int a = -55;
		int b = 100;
		double x, fx;
		int h = 7;
		
		for (x = a; x <= b; x += h) {
			System.out.print("x = " + x + "   ");
			fx = Math.tan(3/x) + (Math.sin(x)) / 2;
			System.out.println("f(x) = " + fx);
		}
	}

}
