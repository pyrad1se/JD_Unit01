package by.htp.tasks.loops;
/* Вывести на экран соответствий между символами и их численными обозначениями 
 * в памяти
компьютера (Таблицу ASCII).
*/
public class LoopsEx26 {
	public static void main(String[] args) {
		
		for (char ch1 = 35; ch1 <= 100; ch1++) {
			System.out.print(ch1 + "   ");
			System.out.println((int)(ch1));
		}
	}
}
