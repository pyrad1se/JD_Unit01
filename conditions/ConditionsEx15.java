package by.htp.tasks.conditions;
/*Даны действительные числа х и у, не равные друг другу. 
 * Меньшее из этих двух чисел заменить половиной их
суммы, а большее — их удвоенным произведением.*/
public class ConditionsEx15 {
	public static void main(String[] args) {
		double x = 222;
		double y = 433;
		
		if(x < y) {
			x = (x + y) / 2;
			y = x * y * 2;
		} else {
			y = (x + y) / 2;
			x = x * y * 2;
		}
		
		System.out.println("x = " + x + "\n" + "y = " + y);
	}

}
