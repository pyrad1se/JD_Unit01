package by.htp.tasks.conditions;
/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через
отверстие.*/
public class ConditionsEx31 {
	public static void main(String[] args) {
		int A = 7;
		int B = 5;
		
		int x = 4;
		int y = 6;
		int z = 10;
		
		if ((x < A | x < B) | (y < A | y < B) | (z < A | z < B)) {
			System.out.println("Пройдет");
		} else {
			System.out.println("Не пройдет");
		}
	}

}
