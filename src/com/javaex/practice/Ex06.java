package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("첫번째 숫자: ");
	    num1 = sc.nextInt();
	    System.out.print("두번째 숫자: ");
	    num2 = sc.nextInt();
	    
	    if(num1>num2) {
	    	int a = num1/num2;
	    	System.out.println("몫: " + a);
	    	System.out.println("나머지: " + num1%num2);
	    }
	    else if(num1<num2) {
	    	int a = num2/num1;
	    	System.out.println("몫: " + a);
	    	System.out.println("나머지: " + num2%num1);
	    
	    }
	    else if(num1==num2) {
	    	System.out.println("몫: 1");
	    	System.out.println("나머지: 0");
	    }
		
		
		sc.close();
	}

}
