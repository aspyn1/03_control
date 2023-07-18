package edu.kh.contrl.condition;

import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in);

	public void ex1() {

		// 단일 if문 : 조건식이 true 일때만 내부 코드를 수행

		/*
		 * if(조건식) { 조건식이 true 일 때 수행할 코드 }
		 */

		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();

		// 입력된 정수가 양수인지 검사
		if (input1 > 0) {
			System.out.println("양수입니다.");
		}

		if (input1 <= 0) {
			System.out.println("양수가 아닙니다.");
		}

	}

	public void ex2() {

		// if~else문 : 조건식 결과가 true면 if문, false면 else 구문이 수행된다.

		/*
		 * if(조건식) { 조건식이 true일 때 수행할 코드 } else { 조건식이 false일 때 수행할 코드 }
		 */

		// 홀짝 검사

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input % 2 != 0) { // 홀수찾기
			System.out.println("홀수 입니다.");
		} else { // 짝수 또는 0입력 시 수행
			if (input == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
		}

	}

	public void ex3() {

		// 양수, 음수, 0 판별
		// if - else - if - else 사용

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input > 0) {
			System.out.println("양수 입니다.");
		} else if (input < 0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0 입니다.");
		}
	}

	public void ex4() {
		// 달을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파 경보", -12도 이하 "한파 주의보"
		// 여름일 때 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"
		// 1~12월이 아닐 땐 '해당하는 계절이 없습니다' 출력

		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		int temperature = -16;

		String season; // 아래 조건문 수행 결과를 저장할 변수 선언

		if (month == 1 || month == 2 || month == 12) {
			season = "겨울";
			if (temperature <= -15) {
				season += " 한파 경보";
			} else if (temperature <= -12) {
				season += " 한파 주의보";
			}
		} else if (month >= 6 && month <= 8) {
			season = "여름";
			if (temperature >= 35) {
				season += " 폭염 경보";
			} else if (temperature >= 33) {
				season += " 폭염 주의보";
			}
		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}

		System.out.println(season);
	}

	public void ex5() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		/*if (age > 19) {
			System.out.println("성인 입니다.");
		} else if (age > 13 || age <= 19) {
			System.out.println("청소년 입니다.");
		} else if (age <= 13) {
			System.out.println("어린이 입니다.");
		}*/
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age > 19) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		}
	}

	public void ex6() {
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String result;
		
		/*if(score < 0 || score > 100) {
			result = "잘못 입력하셨습니다.";
		} else if(score < 60){
			result = "F";
		} else if(score >= 60 && score < 70){
			result = "D";
		} else if(score >= 70 && score < 80){
			result = "C";
		} else if(score >= 80 && score < 90){
			result = "B";
		} else if(score >= 90){
			result = "A";
		}*/
		
		if(score < 0 || score > 100) {
			result = "잘못 입력하셨습니다.";
		} else if(score >= 90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else if(score >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.println(result);
	}

	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		/*if(age < 0 || age > 100){
			System.out.println("잘못 입력 하셨습니다.");
		} else if(age >= 12 && tall >= 140.0){
			System.out.println("탑승 가능");
		} else if(age < 12){
			System.out.println("적정 연령이 아닙니다.");
		} else if(tall < 140.0){
			System.out.println("적정 키가 아닙니다.");
		}*/
		
		if(age < 0 || age > 100){
			result = "잘못 입력 하셨습니다.";
		} else {
			System.out.print("키 입력 : ");
			double tall = sc.nextDouble();
			if (age < 12) {
				result = "적정 연령이 아닙니다.";
			} else if(tall < 140.0) {
				result = "적정 키가 아닙니다.";
			} else {
				result = "탑승 가능";
			}
		}
		
		System.out.println(result);
	}

	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상 && 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		//(age < 0 || age > 100)
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		//(tall < 0.0 || tall > 250.0)
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"
		
		/*System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age < 0 || age > 100) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
			return;
		}
		
		System.out.print("키 입력 : ");
		double tall = sc.nextDouble();
		if(tall < 0.0 || tall > 250.0) {
			System.out.println("키를 잘못 입력 하셨습니다.");
			return;
		}
		
		if((age < 0 || age > 100) && (tall < 0.0 || tall > 250.0)) {
			System.out.println("나이와 키 모두 적절치 않음");
		}else if((age > 0 && age <= 100) && (tall > 0.0 && tall <= 250.0)) {
			System.out.println("탑승 가능");
		}else if(tall < 0.0 || tall > 250.0) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		}else if(age < 0 || age > 100) {
			System.out.println("키는 적절하나, 나이는 적절치 않음");
		}*/
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력하셨습니다.";
		}else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250) {
				result = "키를 잘못 입력하셨습니다.";
			} else {
				
				if(age < 12 && height >= 140.0) {
					result = "키는 적절하나, 나이가 적절치 않음";
				} else if(age >= 12 && height < 140.0) {
					result = "나이는 적절하나, 키가 적절치 않음";
				} else if(age < 12 && height < 140.0) {
					result = "나이와 키 모두 적절치 않음";
				} else {
					result = "탑승 가능";
				}
				
			}
		}
		
		System.out.println(result);
	}

}
