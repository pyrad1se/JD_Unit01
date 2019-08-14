package by.htp.tasks.loops;
/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 *  которых больше или
равен заданному е. Общий член ряда имеет вид:
(3 2)(3 1)
1
− +*/
public class LoopsEx20 {
	public static void main(String[] args) {
		double e = 0;
		double sum = 0;
		
		for (int n = 0; n <= 190; n +=3) {
			if(Math.abs(1 / ((3 * n - 2)* (3 * n + 1))) == e) {
				sum +=n;
				
			}
			
		}
		System.out.println(sum);
	}

}
