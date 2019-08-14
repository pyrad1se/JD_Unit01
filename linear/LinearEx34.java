package by.htp.tasks.linear;
/*Дана величина А, выражающая объем информации в байтах. 
 * Перевести А в более крупные единицы измерения
информации.*/
public class LinearEx34 {
	public static void main(String[] args) {
		double a = 2048;
		double kb = a / 1024;
		double mb = kb / 1024;
		System.out.println(a + " байт: " + kb + " килобайт, "
		+ mb + " мегабайт" );
	}

}
