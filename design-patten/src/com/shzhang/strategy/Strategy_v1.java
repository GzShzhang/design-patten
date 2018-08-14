package com.shzhang.strategy;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 * @author me
 *
 */
public class Strategy_v1 {
	public static void main(String[] args) {
		//总金额
		BigDecimal total = new BigDecimal(0);
		total = amountOfCalculation(total);
		System.out.println("总计：" + total);
	}
	
	//计算金额
	private static BigDecimal amountOfCalculation(BigDecimal total) {
		try {
			//获取控制台输入内容
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入单价：");
			//单价
			BigDecimal unitPrice = scan.nextBigDecimal();
			
			System.out.println("请输入数量");
			//数量
			BigDecimal number = scan.nextBigDecimal();
			
			total = unitPrice.multiply(number);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	
}
