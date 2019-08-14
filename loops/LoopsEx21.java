package by.htp.tasks.loops;
/*Составить программу для вычисления значений функции F(x) на отрезке [а, b]
 *  с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, 
второй - соответствующие
значения функции:*/
public class LoopsEx21 {
	public static void main(String[] args) {
		int a = -32;
		int b = 94;
		double x, fx;
		int h = 5;
		
		for (x = a; x <= b; x +=h) {
			System.out.print("x = " + x + "\t\t\t");
			fx = x - Math.sin(x);
			System.out.println("f(x) = " + fx);
		}
	}

}
