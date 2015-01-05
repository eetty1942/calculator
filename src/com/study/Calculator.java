package com.study;

import java.util.Scanner;

public class Calculator {

	public static int Adder(int val1, int val2) {
		return val1 + val2;
	}

	public static int Subtractor(int val1, int val2) {
		return val1 - val2;
	}

	public static int Multiplier(int val1, int val2) {		
		return val1 * val2;
	}

	public static int Division(int val1, int val2) {
		return val1 / val2;
	}

	protected static String toHex(int value) {	
		String toHex = Integer.toHexString(value);
		return toHex;
	}


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int val1, val2;
		int result=0;
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
				result = Adder(val1, val2);
				System.out.printf("더하기 : %d", result);
				break;
			case 2:
				result = Subtractor(val1, val2);
				System.out.printf("빼   기 : %d", result);
				break;
			case 3:
				result = Multiplier(val1, val2);
				System.out.printf("곱하기 : %d", result);
				break;
			case 4:
				result = Division(val1, val2);
				System.out.printf("나누기 : %d", result);
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
