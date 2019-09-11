package com.arc.array1;

import java.util.Scanner;

public class ArrayTest9 {

	public static void main(String[] args) {
		//조건 : 과목은 국어, 영어, 수학 3과목으로 고정
		//    : 학생의 인원수는 N명
		//1. 성적입력
		/*
		 * 학생의 수를 입력:
		 * 이름, 번호, 국어, 영어, 수학점수 입력
		 */
		//2. 전체조회
		/*
		 * 모든 학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균 출력
		 */
		//3. 학생검색
		/*
		 * 학생의 번호를 입력
		 * 해당 학생의  이름, 번호, 국어, 영어, 수학, 총점, 평균 출력
		 */
		//4. 종료

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		String [] names=null;
		int [] numbers=null;
		int [] kor=null;
		int [] eng=null;
		int [] math=null;
		int [] sum = null;
		int [] avr = null;
		int i=0;
		int num = 0;


		while(check) {
			System.out.println("1. 성적입력");
			System.out.println("2. 전체조회");
			System.out.println("3. 학생검색");
			System.out.println("4. 종      료");
			int select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("학생 수를 입력하세요.");
				num = sc.nextInt();

				names = new String [num];
				numbers = new int [num];
				kor = new int [num];
				eng = new int [num];
				math = new int [num];
				sum = new int [num];
				avr = new int [num];

				for(i=0;i<num;i++) {
					System.out.println("학생의 이름을 입력하세요.");
					names [i] = sc.next();
					System.out.println("학생의 번호를 입력하세요.");
					numbers [i] = sc.nextInt();
					System.out.println("학생의 국어 점수를 입력하세요.");
					kor [i] = sc.nextInt();
					System.out.println("학생의 영어 점수를 입력하세요.");
					eng [i] = sc.nextInt();
					System.out.println("학생의 수학 점수를 입력하세요.");
					math [i] = sc.nextInt();
					sum [i] = kor[i]+eng[i]+math[i];
					avr [i] = sum [i]/3;
				}//for
				break;

			case 2:
				for(i=0;i<num;i++) {
					System.out.println("이름 : "+names[i]);
					System.out.println("번호 : "+numbers[i]+"번");
					System.out.println("국어점수 : "+kor[i]+"점");
					System.out.println("영어점수 : "+eng[i]+"점");
					System.out.println("수학점수 : "+math[i]+"점");
					System.out.println("총점 : "+sum[i]+"점");
					System.out.println("평균 : "+avr[i]+"점");
					System.out.println("=======");
				}
				break;

			case 3:
				System.out.println("학생의 번호를 입력하세요.");
				int n = sc.nextInt();

				for(i=0;i<num;i++) {	
					if(n==numbers[i]) {
						System.out.println("이름 : "+names[i]);
						System.out.println("번호 : "+numbers[i]+"번");
						System.out.println("국어점수 : "+kor[i]+"점");
						System.out.println("영어점수 : "+eng[i]+"점");
						System.out.println("수학점수 : "+math[i]+"점");
						System.out.println("총점 : "+sum[i]+"점");
						System.out.println("평균 : "+avr[i]+"점");
					}//if

				}//for

				break;

			default:
				System.out.println("종료");
				check = false;
			}//if

		}//while

	}//main
}
