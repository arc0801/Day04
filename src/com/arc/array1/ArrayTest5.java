package com.arc.array1;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열 4개를 담을 수 있는 배열을 선언
		//반복문을 이용해서 4개의 데이터를 입력
		//names[0]=sc.next();
		//4개의 데이터를 출력

		String [] names = new String [4];

		for(int i=0;i<4;i++) {
			System.out.println(i+1+"번째 데이터를 입력해주세요.");
			names[i]= sc.next();
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(names[i]);
		}

	}//main
}
