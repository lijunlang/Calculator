package com.example.calculator;

public class InputItem {
	
	private String input;
	private int type;
	
	
	
	public InputItem() {
		super();
	}
	public InputItem(String input, int type) {
		super();
		this.input = input;
		this.type = type;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	interface InputType {
		public static final int INT_TYPE = 0; //int 类型
		public static final int DOUBLE_TYPE=1; //double 类型
		public static final int OPERATOR_TYPE = 2; //操作符类型
		public static final int ERROR = 3; //操作符类型
	}

	@Override
	public String toString() {
		return "InputItem [input=" + input + ", type=" + type + "]";
	}
	

}
