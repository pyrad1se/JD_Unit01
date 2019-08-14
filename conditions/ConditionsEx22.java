package by.htp.tasks.conditions;

/*Перераспределить значения переменных х и у так, чтобы в х оказалось 
 * большее из этих значений, а в y - меньшее*/

public class ConditionsEx22 {
	public static void main(String[] args) {
		int x = 2;
		int y = 44;
		int z;
		
		if (x < y) {
			z = x;
			x = y;
			y = z;
			
		}
		
		
		
		System.out.println("x равно " + x + ". y равно " + y);
	}

}
