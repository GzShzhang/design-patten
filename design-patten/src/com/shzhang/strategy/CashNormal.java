package com.shzhang.strategy;

import java.math.BigDecimal;

/**
 * @author me
 */
public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(BigDecimal money) {
		return money.doubleValue();
	}

}
