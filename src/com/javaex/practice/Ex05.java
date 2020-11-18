package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cm;
		int kg;
		
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		cm = sc.nextInt();
		
		System.out.print("몸무게: ");
		kg = sc.nextInt();
		
		
		
		
		if((cm-100)*0.9<72) {
			int a = (int) ((cm-100)*0.9);
			System.out.println("저체중입니다.");
			System.out.println("표준체중: " + a);
		}
		else if((cm-100)*0.9==72) {
			int a = (int) ((cm-100)*0.9);
			System.out.println("표준입니다.");
			System.out.println("표준체중: " + a);
		}
		else if((cm-100)*0.9>72) {
			int a = (int) ((cm-100)*0.9);
			System.out.println("과체중입니다.");
			System.out.println("표준체중: " + a);
		}
		
		
		
		sc.close();
	}

}
