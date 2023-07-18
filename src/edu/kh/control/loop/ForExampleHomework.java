package edu.kh.control.loop;

import java.util.Scanner;

public class ForExampleHomework {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다.
			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			}
		}
	}

	public void ex2() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다.
			
			1이상의 숫자를 입력하세요 : 4
			4 3 2 1
			
			1이상의 숫자를 입력하세요 : 0
			1 이상의 숫자를 입력해주세요.
		 */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void ex3() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
			ex.
			정수를 하나 입력하세요 : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void ex4() {
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			
			ex.
			첫 번째 숫자 : 8 
			두 번째 숫자 : 4 
			4 5 6 7 8 
		 */
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if((num1 < 1) || (num2 < 1)) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else if(num1 > num2){
			for(int i = num2; i <= num1 ; i++) {
				System.out.println(i);
			}
		}else {
			for(int i = num1; i <= num2 ; i++) {
				System.out.println(i);
			}
		}
	}
	
	public void ex5() {
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.

			ex.
			숫자 : 4
			===== 4단 =====
			4 * 1 = 4
			4 * 2 = 8
			4 * 3 = 12
			4 * 4 = 16
			4 * 5 = 20
			4 * 6 = 24
			4 * 7 = 28
			4 * 8 = 32
			4 * 9 = 36
		 */
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
}  
