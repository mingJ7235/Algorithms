package p1;

import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두정수 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1+ num2;
		
		System.out.println(sum);
		
	}
}
