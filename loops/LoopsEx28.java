package by.htp.tasks.loops;
/* Написать программу, в которой вводятся два операнда Х и Y и знак операции
 *  (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный 
неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных 
вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения 
вычислений принять
‘0’.
*/

import java.util.Scanner;

public class LoopsEx28 {
	public static void main(String[] args) {
		calc();
		
		Scanner myObj4 = new Scanner(System.in);
		System.out.println("Желаете продолжить? Нажмите 0 чтобы выйти ");
		int exit = myObj4.nextInt();
		
		if (exit == 0) {
			System.out.println("Всего доброго");
		} else {
			calc();
		}

	
			
			
		}
		
		
		

	
	public static int calc() {
		
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Введите x >");
		int x = myObj1.nextInt();

		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Введите y >");
		int y = myObj1.nextInt();

		Scanner myObj3 = new Scanner(System.in);
		System.out.println("Введите знак операции >");
		char operation = myObj1.next().charAt(0);
		switch(operation) {
		case '+':
			System.out.println(x + y);
			break;
	
		case '-':
			System.out.println(x - y);
			break;
		
		case '*':
			System.out.println(x * y);
			break;
			
		case '/':
			System.out.println(x / y);
			
	}
		return(1);
	}
	}
