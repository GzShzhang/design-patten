package com.shzhang.demo;

import java.math.BigDecimal;
import java.util.Scanner;

public class Counter02 {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入数字A");
			BigDecimal numberA = scan.nextBigDecimal();
			
			System.out.println("请输入运算符号（+，-，*，/）：");
			String operate = scan.next();
		
			System.out.println("请输入数字B：");
			BigDecimal numberB = scan.nextBigDecimal();
			
			BigDecimal result = null;
			switch(operate) {
			case "+" : 
				result = numberA.add(numberB);
				break;
			case "-" :
				result = numberA.subtract(numberB);
				break;
			case "*" :
				result = numberA.multiply(numberB);
				break;
			case "/" :
				if(!new BigDecimal(0).equals(numberB)) {
					result = numberA.divide(numberB);
				} else {
					System.out.println("被除数不能为0");
				}
				break;
			default : System.out.println("请输入正确的运算符");
			break;
			}
			if(result != null) {
				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
