package com.arc.array1;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		//점수를 3개를 입력 받아서 -> 점수를 저장할 배열 생성
		//총점과 평균을 계산해서 출력
		
		Scanner sc = new Scanner(System.in);
		int subject = 0;
		//String name = "";
		
		System.out.println("과목 수를 입력하세요.");
		subject = sc.nextInt();
		
		//과목수만큼 과목명을 입력
		String [] n = new String [subject];
		for(int i=0;i<n.length;i++) {
			System.out.println(i+1+" 번째 과목명 입력");
			n[i]=sc.next();
		}
		
		int [] score = new int [subject];
		int sum = 0; //합계를 담을 변수
		
		for(int i=0;i<score.length;i++) {
			//System.out.println("과목명을 입력하세요.");
			//name = sc.next();
			
			System.out.println(n+" 점수를 입력하세요");
			score [i] = sc.nextInt();
			
			sum = sum + score [i];
			//sum+=points[i];
		}
				
		System.out.println("총점 : "+sum+"점");
		System.out.println("평균 : "+sum/score.length+"점");
		
	}//main
}
