package by.htp.tasks.conditions;
/* Составить программу сравнения введенного числа а и цифры 3. 
 * Вывести на экран слово «yes», если число а меньше
3; если больше, то вывести слово «no». */
import java.util.Scanner;

public class ConditionsEx03 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите число: ");
		int num = myObj.nextInt();
		
		if (num < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}

}
