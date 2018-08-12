package com.shzhang.strategy;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 *  
 * @author me
 *
 */
public class Strategy_v2 {
	public static void main(String[] args) throws Exception {
		//总金额
		double total = 0.00;
		total = amountOfCalculation(total);
		System.out.println("总计：" + total);
	}
	
	//计算金额
	private static Double amountOfCalculation (double total) throws Exception{
		try {
			//获取控制台输入内容
			Scanner scan = new Scanner(System.in);
			//折扣
			System.out.println("请选择折扣：1（正常收费），2（打八折），3（打七折），4（打五折）");
			String choose = scan.next();
			BigDecimal range = new BigDecimal(1);
			switch(choose) {
			case "1" : 
				range = new BigDecimal(1);
				break;
			case "2" : 
				range = new BigDecimal(0.8);
				break;
			case "3" : 
				range = new BigDecimal(0.7);
				break;
			case "4" : 
				range = new BigDecimal(0.5);
				break;
			default : throw new Exception("请选择正确的折扣类型");
			}
			
			System.out.println("请输入单价：");
			//单价
			BigDecimal unitPrice = scan.nextBigDecimal();
			
			System.out.println("请输入数量");
			//数量
			BigDecimal number = scan.nextBigDecimal();
			
			total = unitPrice.multiply(number).multiply(range).doubleValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	
}
