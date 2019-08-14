package by.htp.tasks.conditions;
/*Даны три числа a, b, с. Определить, какое из них равно d. 
 * Если ни одно не равно d, то найти max(d — a, d — b, d —
c).
*/
public class ConditionsEx28 {
	public static void main(String[] args) {
		 int a = 23;
		 int b = 14;
		 int c = 11;
		 
		 int d = 333;
		 
		 if (a == d) {
			 System.out.println();
		 }
		 
		 else if (b == d) {
			 System.out.println();
		 }
		 
		 else if (c == d) {
			 System.out.println();
		 }
		 
		 else {
			 int m = Math.max(d - a, Math.max(d - b, d - c));
			 System.out.println("max равно " + m);
		 }
		 
	}

}
