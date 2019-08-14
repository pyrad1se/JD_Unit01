package by.htp.tasks.loops;
/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или
равен заданному е. Общий член ряда имеет вид:
n
n
n
a
1
( 1)*/
public class LoopsEx18 {
	public static void main(String[] args) {
		double e = 4;
		double n = 5;
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			double a = Math.pow(-1, n - 1) / n;
			System.out.println(a);
			if (a == e) {
				result += a;
				System.out.println(result);
			}
		}
	}

}
