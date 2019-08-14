package by.htp.tasks.linear;
/*Найти площадь равнобедренной трапеции с основаниями а и b 
 * и углом α при большем основании а
 */
public class LinearEx24 {
	public static void main(String[] args) {
		double a = 90;
		double b = 60;
		double c = 40;
		double i = 70;
		
		double S = c * Math.sin(i) * (a - c * Math.cos(i));
		
		System.out.println("Площадь трапеции равна " + S);
	}

}
