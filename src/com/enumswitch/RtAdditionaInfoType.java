package com.enumswitch;

public enum RtAdditionaInfoType {
	language("LANGUAGE"), 
	Channel("CHANNEL"), 
	ConditionGroup("CONDITION_GROUP"), 
	ProductCode("PRODUCT_CODE"), 
	SessionProcessId("SESSION_PROCESS_ID"),
	RecoverySessionProcessId("RECOVERY_SESSION_PROCESS_ID"),
	RevokedRecoverySessionProcessId("REVOKED_RECOVERY_SESSION_PROCESS_ID"),
	RecoverySessionProcessCount("RECOVERY_SESSION_PROCESS_COUNT"),
	ExchangedToken("EXCHANGED_TOKEN"),
	Campaign("CAMPAIGN"),
	DefaultLoanAmount("DEFAULT_LOAN_AMOUNT"),
	DefaultLoanDuration("DEFAULT_LOAN_DURATION"),
	ExecutionMode("EXECUTION_MODE"),
	CustomerId("CUSTOMER_ID"),
	MktCampaign("MKT_CAMPAIGN"),
	MktClickId("MKT_CLICK_ID"),
	MktContent("MKT_CONTENT");	
	
	private String key;

	private RtAdditionaInfoType(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

	public static RtAdditionaInfoType valueOfKey(String key) {
		for (RtAdditionaInfoType value : values()) {
			if (value.getKey().equals(key)) {
				return value;
			}
		}
		return null;
	} 

	
}
