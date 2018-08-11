package com.shzhang.operation;

import java.math.BigDecimal;

public class OperationDiv extends Operation {

	@Override
	public BigDecimal getResult() throws Exception{
		BigDecimal result = new BigDecimal(0);
		
		if(!new BigDecimal(0).equals(getNumberB())) {
			result = getNumberA().divide(getNumberB());
			return result;
		} else {
			throw new Exception("除数不能为0");
		}
	}
	
}
