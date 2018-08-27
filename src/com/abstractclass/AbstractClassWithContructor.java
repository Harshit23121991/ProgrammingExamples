package com.abstractclass;

abstract class AbstractClassWithContructor {
	int multiplyBy;

	public AbstractClassWithContructor(int multiplyBy) {
		this.multiplyBy = multiplyBy;
	}

	public int mutiply(int val) {
		return multiplyBy * val;
	}
}
