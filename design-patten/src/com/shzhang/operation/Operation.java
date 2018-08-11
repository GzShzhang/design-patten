package com.shzhang.operation;

import java.math.BigDecimal;

public abstract class Operation {
	//数字A
	private BigDecimal numberA;
	//数字B
	private BigDecimal numberB;
	
	public BigDecimal getNumberA() {
		return numberA;
	}
	public void setNumberA(BigDecimal numberA) {
		this.numberA = numberA;
	}
	public BigDecimal getNumberB() {
		return numberB;
	}
	public void setNumberB(BigDecimal numberB) {
		this.numberB = numberB;
	}
	
	public abstract BigDecimal getResult() throws Exception;
	
	
}
