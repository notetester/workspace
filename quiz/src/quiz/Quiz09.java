package quiz;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		/*
		 * 정수를 받아서, 10보다 작고, 3의 배수가 아니며, 4의 배수가 아니라면
		 * "10보다 작으며 3의 배수, 4의 배수가 아닙니다."
		 * 
		 * 그렇지 않으면
		 * "10보다 작지 않거나 3의 배수, 4의 배수가 맞습니다."
		 */
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		num=sc.nextInt();
		if(num<10&&num%3!=0&&num%4!=0) {
			System.out.println("10보다 작으며 3의 배수, 4의 배수가 아닙니다.");
		}else {
			System.out.println("10보다 작지 않거나 3의 배수, 4의 배수가 맞습니다.");
		}
		sc.close();
	}
}
