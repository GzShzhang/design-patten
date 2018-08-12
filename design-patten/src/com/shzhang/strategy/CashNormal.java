package com.shzhang.strategy;

import java.math.BigDecimal;

public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(BigDecimal money) {
		return money.doubleValue();
	}

}
