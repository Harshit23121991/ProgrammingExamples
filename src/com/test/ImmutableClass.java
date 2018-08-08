package com.test;

public final class ImmutableClass {

	final String pancardNumber;

	public ImmutableClass(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}
