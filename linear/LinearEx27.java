package by.htp.tasks.linear;
/*Дано значение a. Не используя никаких функций и никаких операций, 
 * кроме умножения, получить значение а
8
за
три операции и а
10 за четыре операции.*/
public class LinearEx27 {
	public static void main(String[] args) {
		int a = 2;
		int k2 = a * a;
		int k4 = k2 * k2;
		int k8 = k4 * k4;
		
		int k10 = k8 * k2;
		
		System.out.println("a в 8ой равно: " + k8);
		System.out.println("a в 10ой равно: " + k10);
		
		
	}

}
