package com.shzhang.strategy;

import java.math.BigDecimal;

/**
 * 返利收费子类
 * @author me
 *
 */
public class CashReturn extends CashSuper{
	//返利条件
	private BigDecimal moneyCondition = new BigDecimal(0.0);
	//返利值
	private BigDecimal moneyReturn = new BigDecimal(0.0);
	public CashReturn(BigDecimal moneyCondition,BigDecimal moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	public double acceptCash(BigDecimal money) {
		BigDecimal result = money;
		if(money.compareTo(moneyCondition) >= 0 ) {
			//实际返利值
			BigDecimal realReturn = new BigDecimal(Math.floor(money.divide(moneyCondition).doubleValue())).multiply(moneyReturn);
			//减去返利值
			result = money.subtract(realReturn);
		}
		return result.doubleValue();
	}

}
