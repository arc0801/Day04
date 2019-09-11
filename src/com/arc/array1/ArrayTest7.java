package com.arc.array1;

import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		
		int [] n1 = {1,2,3}; //3
		int [] n2 = {1,2,3,4,5,6,7,8,9}; //4
		
		n1 = n2;
		
		//System.out.println(n1.length);
		
		//1~9 숫자를 하나를 입력받아서.
		//해당 숫자의 인덱스 번호를 출력...
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~9 사이의 숫자를 입력해주세요.");
		int num = sc.nextInt();
		//boolean check = true;
		
		for(int i=0;i<n2.length;i++) {
			if(num==n2[i]) {
				//check = true;
				System.out.println(i);
				break;
			}//if
		}//for
		
		/*
		 * if(check){
		 * 		system.out.println(i);
		 * }else{
		 * 		system.out.println("없는 번호"):
		 */
		
		
		
		
		
		
	}//main
}
