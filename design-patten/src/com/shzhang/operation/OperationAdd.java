package com.shzhang.operation;

import java.math.BigDecimal;

public class OperationAdd extends Operation{

	@Override
	public BigDecimal getResult() {
		BigDecimal result = new BigDecimal(0);
		result = getNumberA().add(getNumberB());
		return result;
	}
	
}
