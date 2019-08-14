package by.htp.tasks.conditions;
/* Даны целые числа m, n. Если числа не равны, то заменить 
 * каждое из них одним и тем же числом, равным большему
из исходных, а если равны, то заменить числа нулями.*/
public class ConditionsEx17 {
	public static void main(String[] args) {
		
		int m = 300;
		int n = 8001;
		
		if(m != n) {
			if(m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}
		System.out.println(m + "\n" + n);
		
	}

}
