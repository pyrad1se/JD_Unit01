package by.htp.tasks.conditions;
/*Программа — льстец. На экране высвечивается вопрос 
 * «Кто ты: мальчик или девочка? Введи Д или М». В
зависимости от ответа на экране должен появиться текст 
«Мне нравятся девочки!» или «Мне нравятся мальчики!»*/
import java.util.Scanner;
public class ConditionsEx21 {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		char ch = myObj.next().charAt(0);
		
		if (ch == 'Д') {
			System.out.println("Мне нравятся девочки!");
		} else if (ch == 'М') {
			System.out.println("Мне нравятся мальчики!");
		}
		
		
		
	}

}
