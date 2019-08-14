package by.htp.tasks.loops;
/*Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.*/

public class LoopsEx14 {
	public static void main(String[] args) {
		double sum = 0;
		for(double n =  1; n <= 22; n++) {
			double k = 1 / n;
			sum += k;
		}
		System.out.println(sum);
	}

}
