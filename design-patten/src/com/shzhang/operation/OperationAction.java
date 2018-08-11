package com.shzhang.operation;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperationAction {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入数字A");
			BigDecimal numberA = scan.nextBigDecimal();
			
			System.out.println("请输入运算符号（+，-，*，/）：");
			String operate = scan.next();
		
			System.out.println("请输入数字B：");
			BigDecimal numberB = scan.nextBigDecimal();
			
			Operation oper;
			//根据输入的运算符实例化出合适的对象
			oper = OperationFactory.createOperate(operate);
			//为属性赋值
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			BigDecimal result = oper.getResult();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
