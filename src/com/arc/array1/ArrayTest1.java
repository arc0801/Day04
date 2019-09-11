package com.arc.array1;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		//배열 선언
		//데이터타입 [] 변수명 = new 데이터타입 [개수];
		//ex) 정수형 데이터를 3개
		int [] numbers = new int [3];
		//new라고 되어있으면 stack이 아니라 Heap에 만들라는 소리
		//변수명 numbers의 데이터타입은 int배열 -> reference type에 해당
		//reference type이란 Heap에 담겨있는 데이터의 메모리 시작 주소를 stack에 담는 것.
		//메모리 시작 주소를 참조해라..
		//데이터 타입이 무엇이 될지 모르기 때문에 index 번호(고정값)을 사용. 0번부터 시작.
		System.out.println(numbers);
		numbers[0]=20;
		numbers[1]=30;
		numbers[2]=40;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		int n = numbers[1];
		numbers[2] = n;
		numbers[0] = (int)3.12;
		numbers[2] = 'c';
		System.out.println(numbers[5]);

	}//main

}
