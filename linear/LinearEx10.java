package by.htp.tasks.linear;
/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑠𝑖𝑛 𝑥 +𝑐𝑜𝑠 𝑦
𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
∗ 𝑡𝑔 𝑥�*/
public class LinearEx10 {
	public static void main(String[] args) {
		
		double x = 90;
		double y = 60;
		
		double result = ((Math.sin(x) + Math.cos(y)) / 
				(Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		
		System.out.println(result);
	}
}
