package com.sudeep.GenericClass;

public class GenericClassOneType<T> {
	public void performAction(final T action) {
		System.out.println(action.getClass().getTypeName());
	}
	
//	public <T, R> performAction2(final T action){
//		final R result = R;
//		return result;
//	}

}
