package com.arc.array1;

public class ArrayTest8_1 {

	public static void main(String[] args) {
		int [] n1 = {1,2,3};
		
		//얕은 복사
		int [] n2 = n1;
		
		System.out.println("n1[0] : "+n1[0]);
		System.out.println("n2[0] : "+n2[0]);
		
		n1[0]=9;
		
		System.out.println("n1[0] : "+n1[0]);
		System.out.println("n2[0] : "+n2[0]);
		
		
		
		
		
		
		//n1 = {9,2,3};
		
		n2 = new int [3];
		//깊은 복사
		for(int i=0;i<n2.length;i++) {
			n2[i]=n1[i];
		}
		
		//n1 = {9,2,3};
		//n2 = {9,2,3};
		
		n1[0]=100;
		
		System.out.println("n1[0] : "+n1[0]);
		System.out.println("n2[0] : "+n2[0]);
		
	}//main
}
