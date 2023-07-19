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
	
	// for 응용
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
		// 구구단 출력
		// 2~9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2~9 사이 숫자가 아니면 '잘못입력하셨습니다' 출력
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if( (dan <= 1) || (dan >= 9) ) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		}
	}
	
	public void ex15() {
		// 19단 출력기
		// 2~19단 사이 단을 입력받아서 x 1 ~ x 19까지 출력
		// 단, 2~19 사이 단이 입력되지 않으면 '잘못 입력 하셨습니다.' 출력
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if((dan <= 1) || (dan >= 20)) {
			System.out.println("잘못 입력 하셨습니다.");
		}else {
			for(int i = 1; i <= 19; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		}
	}
	
	// 중첩반복문 > 구구단 출력하기
	public void ex16() {
		// 구구단 모두 출력하기
		
		for(int dan = 2; dan <= 9; dan++) { // 2단~9단까지 차례대로 증가
			
			for(int num = 1; num <= 9; num++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
				System.out.printf("%2d X %2d = %2d", dan, num, dan * num);
			}
			
			System.out.println(); // 하나의 단 출력이 끝났을 때 줄바꿈
			// 아무내용 없은 println은 줄바꿈
		}
			
	}
	
	public void ex17() {
		// 구구단 역순 출력
		
		for(int dan = 9; dan >= 2; dan--) { // 9단 > 2단까지 역방향
			
			for(int num = 1; num <= 9; num++) { // 곱해지는 수는 1 > 9 순방향
				
				System.out.printf("%d X %d = %2d  ", dan, num, dan*num);
			}
			
			System.out.println();
		}
	}
	
	// 중첩반복문 > 출력모양 만들기
	public void ex18() {
		// 2중 for문을 이용해서 다음 모양을 출력하시오.
		
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int line = 1; line <= 5; line++) { // 5줄 출력하는 for문
			
			for(int i = 1; i <=5; i++) { // 12345 한 줄 출력하는 for문
				
				System.out.print(i);
			
			}
			System.out.println();
		}
	}
	
	public void ex19() {
		// 출력내용
		// 54321
		// 54321
		// 54321

		for(int line = 1; line <= 3; line++) {
			
			for(int i = 5; i >= 1; i--) {
				
				System.out.print(i);
				
			}
			System.out.println();
		}
	}
	
	public void ex20() {
		// 출력내용
		// 1
		// 12
		// 123
		// 1234
		
		for(int line = 1; line <= 4; line++) {
			
			for(int i = 1; i <= line; i++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void ex21() {
		// 출력내용
		// 4321
		// 321
		// 21
		// 1
		
		for(int line = 4; line >= 1; line--) {
			
			for(int num = line; num >= 1; num--) {
				
				System.out.print(num);
			}
			
		System.out.println();
		}
	}
	
	// 배수의 총 개수 / 배수의 합계 구하기
	public void ex22() {
		// 숫자세기 count
		
		// 1부터 20까지 1씩 증가하면서
		// 3의 배수의 총 개수 출력
		// 3의 배수의 합계 출력
		
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		int count = 0 ; // 3의 배수의 갯수를 세기위한 변수
		int sum = 0; // 3의 배수의 합계를 구하기위한 변수
		
		for(int i = 1; i <= 20; i++){
			
			 if(i % 3 == 0) {
				 
				System.out.print(i + " ");
				count++;
				sum += i;
				 
			 }
		}
		
		System.out.println(" : " + count);
		System.out.println("3의 배수 합계 : " + sum);
	}
	
	// 
	public void ex23() {
		
		// 2중 for문과 count를 이용해서 아래 모양 출력하기
		
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		
		int count = 1;
		
		for(int line = 1; line <= 3; line++) {
			
			for(int i = 1; i <= 4; i++) {
				
				System.out.printf("%3d", count);
				count++;
				
			}
			System.out.println();
		}

	}
	
	// 구구단 세로 출력
	public void ex24() {
		
		for(int num = 1; num <= 9; num++) {
			
			for(int dan = 2; dan <= 9 ; dan++) {	
				
				System.out.printf("%d X %d = %d\t", dan, num, dan*num);
			}
			System.out.println();
		}
	}
	
}
