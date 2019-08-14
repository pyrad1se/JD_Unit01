package by.htp.tasks.conditions;
/*Даны два угла треугольника (в градусах). Определить, существует ли 
 * такой треугольник, и если да, то будет ли он
прямоугольным*/
public class ConditionsEx14 {
	public static void main(String[] args) {
		int a = 79;
		int b = 50;
		
		if ((a + b) < 180) {
			System.out.println("Такой треугольник существует" );
			if ((a + b) == 90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Не прямоугольный");
			}
		}
	}

}
