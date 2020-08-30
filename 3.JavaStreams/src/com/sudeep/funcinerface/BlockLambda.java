package com.sudeep.funcinerface;

public class BlockLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumericFuncInterface numfi = (n) -> {
			
			int result = 1;
			for(int i =0; i<=n ; i++) {
				result = i * n;
			}
			return result;
		};
		
		System.out.println(numfi.func(100000));
	}

}
