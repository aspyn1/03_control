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
	
	public void ex6() {

		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
			단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
			
			숫자 : 4
		 * ===== 4단 =====
		 * ===== 5단 =====
			===== 6단 =====
			===== 7단 =====
			===== 8단 =====
			===== 9단 =====
			(해당 단의 내용들은 길이 상 생략)
			
			숫자 : 10
			2~9 사이 숫자만 입력해주세요.
		 */
		
		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요");
			
		}else {
			
			for(int dan = input; dan <= 9; dan++) {
			
				System.out.println("========= " + dan + "단 =========");

				for(int num = 1; num <= 9; num++) {
					
				System.out.printf("%d X %d = %d  \n", dan, num, dan*num);
					
				}
			}
		}
	}
	
	public void ex7() {
		
		/*
		 * 다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 4
			*
			**
			***
			****
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int line = 1; line <= input; line++) {
			
			for(int i = 1; i <= line; i++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	public void ex8() {
		
		/*
		 * 다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 4
			****
			***
			**
			*
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();  // 4
		
		for(int line = input; line >= 1; line--) {
			
			for(int num = line; num >= 1; num--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void ex9() {
		
		/*
		 * 다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 4
			   *
			  **
			 ***
			****
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int line = 1; line <= input; line++) {
			
			for(int num = 1; num <= input; num++) {	
				
				if(input-line >= num){
					System.out.print(" ");

				}else {
					System.out.print("*");
				}
			}
		System.out.println();
		}
	}
	
	public void ex10() {
		
		/*
		 * 다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 3
			*
			**
			***
			**
			*
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		for(int line = 1; line <= input; line++) {
			
			for(int i = 1; i <= line; i++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		for(int line = input; line >= 1; line--) {
			
			for(int i = line - 1; i >= 1; i--) {
					System.out.print("*");
			}
			System.out.println();	
		}
	}
	
	public void ex11() {
		/*
		 * 다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 4
			   * 총4 빈3 별1
			  *** 총5 빈2 별3
			 ***** 총6 빈1 별5
			******* 총7 빈0 별7
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int line = 1; line <= input; line++) { // 2
			
			for(int num = 1; num <= input+line-1; num++) { // 1

				if(input-line >= num) { //4-2>1 4-2=2
					System.out.print(" ");
				}else if(input-line < num){ // 4-2<3 4-2<4
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	
	public void ex12() {
		/*
		 * 다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 5
			*****
			*   *
			*   *
			*   *
			*****
		 */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int line = 1; line <= input; line++) {
			
			for(int num = 1; num <= input; num++) {
				
				if (line == 1 || line == input) {
					System.out.print("*");
				}else {
					
					if(num == 1 || num == input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void ex13() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지 중에서
			1) 2와 3의 배수를 모두 출력하고
			2) 2와 3의 공배수의 개수를 출력하세요.
			
			* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
			모두 나머지가 0이 나오는 수
			
			ex.
			자연수 하나를 입력하세요 : 15
			2 3 4 6 8 9 10 12 14 15
			count : 2
		 */
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
				
		for(int i = 1; i <= input; i++) {
			
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	
}  
