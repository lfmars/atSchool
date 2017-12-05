package test1;

public class Fibo {
	public static void main(String[] args){
		long first = 0;
		long second = 1;
		long fibo;
		long helper;
		for (int i = 1; i <=50; i++) {
			fibo = first+second;
			helper=first;
			first=second;
			second+=helper;
			System.out.println(i + " " +fibo);
		}
	}
}
