package com.shzhang.operation;

public class OperationFactory {
	public static Operation createOperate(String operate) throws Exception{
		Operation oper = null;
		switch(operate) {
		case "+" : 
			oper = new OperationAdd();
			break;
		case "-" : 
			oper = new OperationSub();
			break;
		case "*" : 
			oper = new OperationMul();
			break;
		case "/" : 
			oper = new OperationDiv();
			break;
		default : throw new Exception("请输入正确的运算符");
		}
		return oper;
	}
}
