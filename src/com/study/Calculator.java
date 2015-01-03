package com.study;

import java.util.Scanner;

public class Calculator {
		static int result;
		
		public static void Adder(int val1, int val2){
			result = val1+val2;
			System.out.printf("더하기 : %d\n", result);
		}
		public  static void Subtractor(int val1, int val2){
			result = val1-val2;
			System.out.printf("빼 기  : %d\n", result);
		}
		public static void Multiplier(int val1, int val2){
			result = val1*val2;
			System.out.printf("곱하기 : %d\n", result);
		}
		public static void Division(int val1, int val2){
			result = val1/val2;
			System.out.printf("나누기 : %d\n", result);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val1, val2;
		int sel=0;
		
		System.out.printf("계산 값1을 입력해 주세요  : ");
		val1 = scan.nextInt();	
		System.out.printf("계산 값2를 입력해 주세요  : ");
		val2 = scan.nextInt();
		
		System.out.printf("4칙연산 계산기 \n");
		System.out.printf("1. 더하기 \n");
		System.out.printf("2. 빼기 \n");
		System.out.printf("3. 곱하기 \n");
		System.out.printf("4. 나누기 \n");
		System.out.printf("하고자 하는 연산번호 입력해 주세요  : ");
		sel = scan.nextInt();
		switch(sel)
		{
		case 1:
			Adder(val1, val2);
			break;
		case 2:
			Subtractor(val1, val2);
			break;
		case 3:
			Multiplier(val1, val2);
			break;
		case 4:
			Division(val1, val2);
			break;
		}
		
		System.out.printf("전체출력(추가기능?) \n");
		Adder(val1, val2);
		Subtractor(val1, val2);
		Multiplier(val1, val2);
		Division(val1, val2);

		
		scan.close();
	}
}
