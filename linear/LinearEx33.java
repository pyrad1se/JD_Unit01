package by.htp.tasks.linear;
/* Ввести любой символ и определить его порядковый номер,
 *  а также указать предыдущий и последующий символы*/

import java.util.Scanner;
public class LinearEx33 {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите символ: ");
	    char ch = myObj.next().charAt(0); 
		int ch1 = ch;
		
		char before_ch = (char) (ch - 1);
		char after_ch = (char) (ch + 1);
		System.out.println("Порядковый номер символа: " + ch1);
		System.out.println("Предыдущий символ: " + before_ch);
		System.out.println("Последующий символ: " + after_ch);
	}

}
