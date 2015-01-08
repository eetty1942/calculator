package com.study;

import java.util.Scanner;

public class Calculator {

	public static int add(int val1, int val2) {
		return val1 + val2;
	}

	public static int subtract(int val1, int val2) {
		return val1 - val2;
	}

	public static int multiply(int val1, int val2) {		
		return val1 * val2;
	}

	public static float divide(int val1, int val2) {
		return val1 / val2;
	}

	protected static String toHex(int value) {	
		String toHex = Integer.toHexString(value);
		return toHex;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int val1; 
		int val2;
		int result=0;
		float div_result=0;
		int input;
		int sel = 0;
				
		System.out.printf("임의 정수 입력 \n");
		input = scan.nextInt();
		String output = toHex(input);
		System.out.printf("16진수 변환 : %s\n", output);

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
		
		switch (sel) {
			case 1:
				result = add(val1, val2);
				System.out.printf("더하기 : %d", result);
				break;
			case 2:
				result = subtract(val1, val2);
				System.out.printf("빼   기 : %d", result);
				break;
			case 3:
				result = multiply(val1, val2);
				System.out.printf("곱하기 : %d", result);
				break;
			case 4:
				div_result = divide(val1, val2);
				System.out.printf("나누기 : %f", result);
				break;
		}	
		scan.close();
	}
}
