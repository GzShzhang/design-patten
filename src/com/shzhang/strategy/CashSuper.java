package com.shzhang.strategy;

import java.math.BigDecimal;

/**
 * 现金收费抽象类
 * @author me
 */
public abstract class CashSuper {
	
	public abstract double acceptCash(BigDecimal money);
}
