package com.shzhang.operation;

import java.math.BigDecimal;

public class OperationSub extends Operation{

	@Override
	public BigDecimal getResult() {
		BigDecimal result = new BigDecimal(0);
		result = getNumberA().subtract(getNumberB());
		return result;
	}

}
