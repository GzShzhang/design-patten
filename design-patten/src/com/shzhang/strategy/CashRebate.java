package com.shzhang.strategy;

import java.math.BigDecimal;

/**
 * 打折收费子类
 * @author me1
 *
 */
public class CashRebate extends CashSuper{
	private BigDecimal moneyRebate = new BigDecimal(1);
	
	/**
	 * 折扣
	 * @param moneyRebate
	 */
	public CashRebate(BigDecimal moneyRebate) {
		this.moneyRebate = moneyRebate;
	}
	
	@Override
	public double acceptCash(BigDecimal money) {
		return money.multiply(moneyRebate).doubleValue();
	}

}
