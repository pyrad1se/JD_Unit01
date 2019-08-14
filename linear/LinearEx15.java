package by.htp.tasks.linear;
/*Написать программу, которая выводит
 *  на экран первые четыре степени числа π.
 */
public class LinearEx15 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.println(Math.pow(Math.PI, i));
		}
	}

}
