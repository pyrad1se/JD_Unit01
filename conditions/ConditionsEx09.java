package by.htp.tasks.conditions;
/*Составить программу, которая определит по трем введенным
 *  сторонам, является ли данный треугольник
равносторонним.*/
import java.util.Scanner;
public class ConditionsEx09 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Введите сторону 1: ");
		int side1 = myObj1.nextInt();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Введите сторону 2: ");
		int side2 = myObj2.nextInt();
		
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("Введите сторону 3: ");
		int side3 = myObj3.nextInt();
		
		if (side1 == side2 & side1 == side3) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}
		
		
	}

}
