package com.shzhang.operation;

import java.math.BigDecimal;

public class OperationMul extends Operation{

	@Override
	public BigDecimal getResult() {
		BigDecimal result = new BigDecimal(0);
		result = getNumberA().multiply(getNumberB());
		return result;
	}
	
}
