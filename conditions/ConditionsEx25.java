package by.htp.tasks.conditions;
/*Написать программу — модель анализа пожарного датчика в помещении, 
 * которая выводит сообщение
«Пожароопасная ситуация », если температура в комнате превысила 60° С.*/
public class ConditionsEx25 {
	public static void main(String[] args) {
		int temp = 700;
		
		if (temp > 60) {
			System.out.println("Пожароопасная ситуация");
		}
	}

}
