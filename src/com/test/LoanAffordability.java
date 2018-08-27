package com.test;

public enum LoanAffordability {
	 DESIRED_LOAN_OFFER("O"), ALTERNATIVE_LOAN_OFFER("C"), NO_LOAN_OFFER("B");

		private String key;

		private LoanAffordability(String key) {
			this.key = key;
		}

		public String getKey() {
			return this.key;
		}

		public static LoanAffordability valueOfKey(String key) {
			for (LoanAffordability value : values()) {
				if (value.getKey().equals(key)) {
					return value;
				}
			}
			return null;
		} 
}
