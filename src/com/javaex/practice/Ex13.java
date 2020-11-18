package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    float x;
		float a;
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		x = sc.nextInt();
		
		if(x<=0) {
			a = (x*x*x)-(9*x)+2;
			System.out.println("계산결과는 " + a + " 입니다.");
		}
		else if(x>0) {
			a = (7*x)+2;
			System.out.println("계산결과는 " + a + " 입니다.");
		}
		else {
			System.out.println("계산결과는 2.0 입니다.");
		}
		
		
		sc.close();
	}

}
