package com.list.sort;

public class Fee {
	
	private String conditionUiName;
	private int amount;
	
	
	public Fee(String conditionUiName, int amount) {
		super();
		this.conditionUiName = conditionUiName;
		this.amount = amount;
	}
	
	public String getConditionUiName() {
		return conditionUiName;
	}
	public void setConditionUiName(String conditionUiName) {
		this.conditionUiName = conditionUiName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Fee [conditionUiName=" + conditionUiName + ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((conditionUiName == null) ? 0 : conditionUiName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fee other = (Fee) obj;
		if (amount != other.amount)
			return false;
		if (conditionUiName == null) {
			if (other.conditionUiName != null)
				return false;
		} else if (!conditionUiName.equals(other.conditionUiName))
			return false;
		return true;
	}
	
	

}
