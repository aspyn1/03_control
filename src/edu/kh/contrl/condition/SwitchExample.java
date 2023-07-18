package edu.kh.contrl.condition;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);
	
	/* switch 문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	 * 
	 * [작성법]
	 * switch(조건문) {
	 * 
	 * case 결과값1 : 수행코드1; break;
	 * case 결과값2 : 수행코드2; break;
	 * ...
	 * 
	 * default : case를 모두 만족하지않을 경우 수행하는 코드;
	 * }
	 */

	public void ex1() {
		// 키보드로 정수를 입력받아
		// 1이면 "빨강색"
		// 2이면 "주황색"
		// 3이면 "노란색"
		// 4이면 "초록색"
		// 1~4 사이의 숫자가 아니면 "흰색" 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		switch(input) {
		
		case 1 : result = "빨강색"; break;
		case 2 : result = "주황색"; break;
		case 3 : result = "노란색"; break;
		case 4 : result = "초록색"; break;
		
		default : result = "흰색";
		}
		
		System.out.println(result);
	}
	
	public void ex2() {
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		String result;
		
		switch(month) {
		
		case 3 : case 4 : case 5 : result = "봄"; break;
		case 6 : case 7 : case 8 : result = "여름"; break;
		case 9 : case 10 : case 11 : result = "가을"; break;
		case 12 : case 1 : case 2 : result = "겨울"; break;
		default : result = "잘못입력";
		
		}
		
		System.out.println(result);
	}
	
	public void ex3() {
		/*
		 * 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
			짝수가 아니면 “홀수입니다.“를 출력하세요.
			양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 * 
		 * [실행 화면 1]
			숫자를 한 개 입력하세요 : 8
			짝수입니다.
			
			[실행 화면 2]
			숫자를 한 개 입력하세요 : 17
			홀수입니다.
			
			[실행 화면 3]
			숫자를 한 개 입력하세요 : -3
			양수만 입력해주세요.
		 */
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input < 0) {
			result = "양수만 입력해주세요.";
		}else if(input % 2 == 0 ) {
			result = "짝수입니다.";
		}else {
			result = "홀수입니다.";
		}
		
		System.out.println(result);
	}
	
	public void ex4() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와. 
		 * 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
			(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
			
			합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
			불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 * 
		 */
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double avg = (kor + math + eng) / 3;
		String result;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("합계 : " + total);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다");
		}
	}
	
	public void ex5() {
		
		/*
		 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
			잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
			
			[실행화면 1]
			1~12 사이의 정수 입력 : 8
			8월은 31일까지 있습니다.
			[실행화면 2]
			1~12 사이의 정수 입력 : 99
			99월은 잘못 입력된 달입니다.
		 * 
		 */
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String result;
		
		switch(month) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			result = (month + "월은 31일까지 있습니다.");
			break;
		case 2 :  
			result = (month + "월은 28일까지 있습니다."); 
			break;
		case 4 : case 6 : case 9 : case 11 : 
			result = "4월은 30일까지 있습니다."; 
			break;
		default : 
			result = (month + "는 잘못 입력된 달입니다.");
		
		}
		
		System.out.println(result);
	}
	
	public void ex6() {
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
			저체중/정상체중/과체중/비만을 출력하세요.
			
			BMI = 몸무게 / (키(m) * 키(m))
			BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
			BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
			BMI가 30이상일 경우 고도 비만
			
			[실행 화면]
			키(m)를 입력해 주세요 : 1.65
			몸무게(kg)를 입력해 주세요 : 58.4
			BMI 지수 : 21.45087235996327
			정상체중
		 */
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		String result;
		
		if (bmi < 18.5) {
			result = "저체중";
		}else if(bmi >= 30) {
			result = "고도 비만";
		}else if(bmi < 23) {
			result = "정상체중";
		}else if(bmi < 25) {
			result = "과체중";
		}else {
			result = "비만";
		}
		
		System.out.println(result);
		
	}

	public void ex7() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
			평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
			이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
			70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		 */
		System.out.print("중간 고사 점수 : ");
		int midTerm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int attendance = sc.nextInt();

		midTerm *= 0.2;
		finalTerm *= 0.3;
		task *= 0.3;
		System.out.println("================= 결과 =================");
		
		if(attendance <= 20 * 0.3) {
			System.out.println("Fail [출석 횟수 부족 (" + attendance + "/20" + ")]");
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", midTerm);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalTerm);
			System.out.printf("과제 점수 	(30) : %.1f\n", task);
			System.out.printf("출석 점수	(20) : %.1f\n", attendance);
			
			double totalScore = midTerm + finalTerm + task + attendance;
			System.out.printf("총점 : %.1f\n", totalScore);
			
			if (totalScore >= 70) {
				System.out.println("PASS");
			}else if(totalScore < 70) {
				System.out.println("Fail [점수 미달]");
			}
		}
	}

	
}
