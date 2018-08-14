package com.shzhang.demo;

import java.math.BigDecimal;
import java.util.Scanner;


public class Counter03 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入数字A");
			BigDecimal numberA = scan.nextBigDecimal();
			
			System.out.println("请输入运算符号（+，-，*，/）：");
			String operate = scan.next();
		
			System.out.println("请输入数字B：");
			BigDecimal numberB = scan.nextBigDecimal();
			
			//进行运算
			BigDecimal result = getResult(numberA,numberB,operate);
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据传进来的数值和运算符进行运算
	 * 运算完成返回运算结果
	 * @author me
	 *
	 */
	public static BigDecimal getResult(BigDecimal numberA, BigDecimal numberB, String operate) {
		BigDecimal result = new BigDecimal(0);
		switch (operate) {
		case "+":
			result = numberA.add(numberB);
			break;
		case "-":
			result = numberA.subtract(numberB);
			break;
		case "*":
			result = numberA.multiply(numberB);
			break;
		case "/":
			if (!result.equals(numberB)) {
				result = numberA.divide(numberB);
			} else {
				System.out.println("被除数不能为0");
			}
			break;
		default:
			System.out.println("请输入正确的运算符");
		}
		return result;
	}
	
}
