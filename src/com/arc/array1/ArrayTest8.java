package com.arc.array1;

import java.util.Scanner;

public class ArrayTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numbers = {1,2,3,4,5};

		int [] numbers2 = null;
		numbers2 = new int [4];
		
		
		System.out.println("1~5 사이의 값을 입력하세요.");
		int n = sc.nextInt();
		
		for(int i=0;i<numbers.length;i++) {
			if(n==numbers[i]) {
				
			}
			numbers [i] = numbers2 [i];
			break;
		}//for

		 
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}


	}//main
}
