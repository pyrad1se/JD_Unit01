package by.htp.tasks.loops;
/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 *  которых больше или
равен заданному е. Общий член ряда имеет вид:
n n n
*/
public class LoopsEx19 {
	public static void main(String[] args) {
		double e = 4;
		double sum = 0;
		for (int i = 1; i <= 20; i+=1) {
			if (Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i)) == e) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}

}
