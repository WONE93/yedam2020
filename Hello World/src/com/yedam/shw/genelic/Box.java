package com.yedam.shw.genelic;

public class Box<T> { // 타입을 정하겠다, 필드들을 정의해주기위해
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}

}
