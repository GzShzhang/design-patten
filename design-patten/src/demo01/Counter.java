package demo01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数字a：");

		if(scan.hasNextBigDecimal()) {
			BigDecimal a = scan.nextBigDecimal();
			System.out.println("请输入运算符号（+，-，*，/）：");
			if(scan.hasNext()) {
				String sign = scan.next();
				System.out.println("请输入数字b：");
				if(scan.hasNextBigDecimal()) {
					BigDecimal b = scan.nextBigDecimal();
					if("+".equals(sign)) {
						System.out.println(a.add(b));
					}
				} else {
					System.out.println("请输入有效数值");
				}
			} else {
				System.out.println("请输入运算符号");
			}
		} else {
			System.out.println("请输入有效数值");
		}
	}
}
