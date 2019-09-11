package com.arc.array1;

public class ArrayTest2 {

	public static void main(String[] args) {
		//double type 3개를 모을 배열을 선언하고
		//각각 3개의 데이터를 입력하고 출력
		
		double [] numbers = new double [3];
		numbers [0] = 10.1;
		numbers [1] = 20.2;
		numbers [2] = 40.3;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		double [] n2=numbers;
		
		n2[1]=12.222;
		
		System.out.println(n2[0]);
		System.out.println("n2[1] : "+numbers[1]);
		System.out.println(n2[2]);
	}

}
