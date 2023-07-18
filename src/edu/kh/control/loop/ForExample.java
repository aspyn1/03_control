package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);
	
	/* for문
	 * - 끝이 정해져있는(횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * for(초기식; 조건식; 증감식){
	 * 		반복 수행할 코드;
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * - 조건식 : for문의 반복 여부를 지정하는 식
	 * 				보통 초기식에 사용된 변수를 이용하여 조건식 작성
	 * - 증감식 : 초기식에 사용된 변수를
	 * 				for문이 끝날 때 마다 증감 또는 감소시켜
	 * 				조건식의 결과를 변하게 하는 식
	 * - 반복 수행할 코드 : 조건식이 true 일 때만 반복한다
	 */
	
	public void ex1() {
		
		for(int i = 1; i <= 10; i++) {
			// 1~10까지 1씩 증가하며 출력하기
			System.out.println(i + "출력");
		}
	}
	
	public void ex2() {
		//3~7까지 1씩 증가하며 출력
		
		for(int i = 3; i <= 7; i++) {
			System.out.println(i + "출력");
		}
	}
	
	public void ex3() {
		//2부터 15까지 1씩 증가하며 출력
		for(int i = 2; i <= 15; i++) {
			System.out.println(i);
		}
	}

	public void ex4() {
		// 1부터 입력받은 수 까지 1씩 증가하며 출력
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
	
	public void ex5() {
		// 1부터 입력받은 수 까지 2씩 증가하며 출력
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i += 2) {
			System.out.println(i);
		}
	}
	
	public void ex6() {
		// 1.0부터 입력받은 실수까지 0.5씩 증가하며 출력
		
		System.out.print("실수 입력 : ");
		double input = sc.nextDouble();
		
		for(double i = 1.0; i <= input; i += 0.5) {
			System.out.println(i);
		}
	}
	
	public void ex7() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력
		// ABCD...Z
		// * char 자료형은 문자형이지만, 실제로 정수(유니코드)를 저장한다.
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i); // 문자로 출력하기 위해 char로 강제 형변환
		}
		
		System.out.println("\n-------------------------------------");
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
	}
	
	public void ex8() {
		// 10부터 1까지 1씩 감소하면서 출력
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	//응용
	public void ex9() {
		// for문 응용1 : 반복문을 이용한 값의 누적
		// 1부터 10까지 모든 정수의 합 구하기 == 55
		
		int sum = 0; // 반복되어 증가되는 i의 값의 합계를 저장할 변수
					// 0으로 시작하는 이유 : 
					// 아무것도 더하지 않음으로 정확한 결과를 도출할 수 있기 때문
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}
	
	public void ex10() {
		// 정수 5개를 입력 받아서 합계 구하기
		
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			sum += input; //sum에 입력받은 input값 누적
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void ex11() {
		// 정수를 몇 번 입력받을지 먼저 입력받고 
		// 입력된 정수의 합계 구하기
		
		// 입력 받을 정수의 개수 : 3
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 합계 : 60
		
		int sum = 0;
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
	}

	public void ex12() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수에 ()를 붙여서 출력
		// 1 2 3 4 (5) 6 7 8 9 (10)....(20)
		
		for(int i = 1; i <= 20; i++) {

			if(i % 5 == 0) {
				System.out.print("(" + i + ") ");
			}else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void ex13() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 () 표시
		
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6)...20

		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % input == 0) {
				System.out.print("(" + i + ") ");
			}else {
				System.out.print(i + " ");
			}
		}
	}
		
	public void ex14() {
		
		
		
	}
	
	
	
}
