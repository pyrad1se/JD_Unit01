package by.htp.tasks.linear;
/*Составить программу перевода радианной меры угла 
 * в градусы, минуты и секунды.*/
import java.text.NumberFormat;
public class LinearEx28 {
	public static void main(String[] args) {
		double r = 0.97;
		double b = Math.toDegrees(r);
		int c = (int) Math.toDegrees(r);
		double d = b - c;
		double min = d * 60;
		int min2 = (int) min;
		int sec = (int) ((min - min2) * 60);
		
		System.out.println(c + " градусов");
		System.out.println(min2 + " минут");
		System.out.println(sec + " секунд");
		
    }
}
