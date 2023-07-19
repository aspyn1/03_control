package edu.kh.contrl.branch;

import java.util.Scanner;

public class BranchExample {
	Scanner sc = new Scanner(System.in);
	
	// break;
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		
		for(int i = 1; i <= 10; i++) {

		System.out.print(i + " ");

			if(i == 5) {
				break;
			}
		}
	}

	public void ex2() {
		// 0이 입력될때 까지의 모든 정수의 합 구하기

		// while문을 처음에 무조건 수행하고, 특정 조건에 종료하는 방법
		
		// 1) input에 초기값을 0이 아닌 다른값 넣고 while(input != 0) 조건넣기
		// 2) do while문 사용
		// 3) 무한루프 상태의 while문 만들고 내부에 브레이크문 작성하기
		
		int input = 0;
		int sum = 0;
		
		
		while(true) { // 무한루프
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
	}
	
	// 문자열 사용하면 탈출하도록 코딩
	public void ex3() {
		// 입력받은 모든 문자열을 누적
		// 단, "exit@"를 입력 시 문자열 누적을 종료하고 결과 출력

		String str = "";
		
		while(true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			// next() : 다음 한 단어(띄워쓰기 포함 x)
			// nextLine() : 다음 한 줄(띄워쓰기 포함 ㅇ)
			
			if(input.equals("exit@")) {
				// 비교연산자는 보통 기본자료형끼리의 연산에서만 사용 가능하다.
				// String > 참조형으로 비교연산자(==) 사용하여 같은 문자열인지 판별할 수 없다.

				// 해결방법 : "문자열1.equals(문자열2)"으로 비교 가능
				
				break;
			}
			str += input + "\n";
		}
	
		System.out.println("==================");
		System.out.println(str);
	}
	
	public void ex4() {
		// 중첩 반복문 내부에서 break 사용하기
		// 단, 2단은 *2까지, 3단은 *3까지만...9단은 *9까지 출력
		
		for(int dan = 2; dan <= 9; dan++) {
			
			for(int num = 1; num <= 9; num++) {
				
				System.out.printf("%d X %d = %2d  ", dan, num, dan * num);

				if(num == dan) {
					break;
				}
			}
			System.out.println();
		}
	}
	
	// continue
	public void ex5() {
		
		// break : 반복문을 바로 멈춤
		// continue : 다음 반복으로 넘어감
		
		// 1~10까지 1씩 증가하며 출력
		// 단, 3의 배수 제외
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 3 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}		
	}
	
	public void ex6() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복을 멈춤
		
		// 출력예시
		// 1
		// 2
		// 3
		// ...
		// 39
		
		for(int i = 1; i <= 100; i++) {
			
			if(i == 40) {
				break;
			}
			
			if(i % 5 == 0){
				continue;
			}
			
			System.out.println(i);
		}
	}

	// [가위 바위 보 게임]
	public void RSPgame() {
		
		System.out.println("[가위 바위 보 게임~!!]");
		System.out.print("몇 판 ? : ");
		int round = sc.nextInt();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++) {
			
			System.out.println("\n" + i + "번째 게임");
			
			System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
			String input = sc.next();
			
			// Math.random();
			// 0.0이상 1.0미만의 난수 생성
			
			// 1) 1~3 사이 난수 생성하여
			// 2) 1이면 가위, 2면 바위, 3이면 보 지정해야함 (switch)
			
			int random = (int)(Math.random() * 3 + 1);
			// x : 0.0 <= x < 1.0
			// x * 3 : 0.0 <= x < 3.0
			// x + 1 : 1.0 <= x < 4.0
			// (int)x : 1 <= x < 4
			// -> x = 1 ~ 3이다.
			
			String com = null; // 컴퓨터가 선택한 가위/바위/보를 저장하는 변수
								// null은 아무것도 참고하고있지 않음.
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			System.out.println("컴퓨터는 [" + com + "]를 선택했습니다.");
			
			// 컴퓨터와 플레이어 가위바위보 판별
			
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
				
			}else {
				
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
					
				}else {
					System.out.println("졌습니다 ㅜㅜ");
					lose++;
				}
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
		}
	}
	
}
