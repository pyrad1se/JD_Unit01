package by.htp.tasks.linear;
/*Дано действительное число R вида nnn.ddd 
 * (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/
public class LinearEx21 {
	public static void main(String[] args) {
		double n = 926.348;
		int k = (int) n;
		double k1 = k;
		int k2 = (int) ((n - k1) * 1000);
		double k3 = (double) k2 / 1000;
		double result = k1 + k3;
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println("Новое число: " + result);
	}
}
