package ex2;

import java.util.*;

public class Container2<T, M> {
	private T t;
	private M m;
	
	public void set(T t, M m) {
		this.t=t;
		this.m=m;
	}
	
	public T getKey() {
		return t;
	}
	
	public M getValue() {
		return m;
	}
	
	
}
