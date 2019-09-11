package com.arc.array2;

public class DoubleArray1 {

	public static void main(String[] args) {
		
		//int [][] nums = new int[2][3];
		
		int [] n1 = {1,2,3};
		int [] n2 = {4,5,6};
		
		//모으려고 데이터타입 [] 변수명
		
		int [][] n3 = {n1,n2};
		
		System.out.println(n3[1][2]);//6
		System.out.println(n3[0]);
		
		
		//int [][] n3 = {{1,2,3},{4,5,6}};
		
		//System.out.println(n3[0][1]);
		
		
	}//main
}
