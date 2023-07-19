package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);
	
	/* while문
	 * - 별도의 초기식, 증감식이 존재하지않고
	 *	 반복 종료 조건을 자유롭게 설정하는 반복문.
	 * 
	 * - 확실히 언제 반복문이 끝날지는 모르지만
	 * 	 언젠가 반복 조건이 false가 되는 경우 반복문을 종료함.
	 * 
	 * [작성법]
	 * while(조건식){
	 * 		조건식이 true일 때 반복 수행할 구문
	 * }
	 */
	
	public void ex1() {
		
		int input = 0; // while문 종료 조건으로 사용
		
		while(input != 9){
			// input에 저장된 값이 9가 아닌 경우 수행코드 반복
			
			System.out.println("-----메뉴선택-------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이를 주문했습니다."); break;
			case 2 : System.out.println("쫄면을 주문했습니다."); break;
			case 3 : System.out.println("김밥을 주문했습니다."); break;
			case 9 : System.out.println("메뉴선택을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
		}
	}

	public void ex2() {
		
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
		// ->0이 입력되지 않으면 계속 반복해라!
		
		int input = -1; // 입력받은 값을 저장할 변수
		int sum = 0; // 모든 정수의 합을 저장하는 변수
				
		while(input != 0){
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input; // 입력받은 값을 sum에 누적
		}
		
		System.out.println("합계 : " + sum);
	}
	
	// 예제2번 do while으로 풀어보기
	public void ex3() {
		/* do~while문 : 
		 * while 문을 최소 한번은 수행하는 반복문
		 */
		
		int input = 0;
		int sum = 0;
		
		do {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input;
			
		}while(input != 0);
		
		System.out.println("합계 : " + sum);
		
	}
	
	
}