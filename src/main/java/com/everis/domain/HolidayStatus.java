package com.everis.domain;

public enum HolidayStatus {
	
	PENDING("Pending"),
	ACCEPTED("Accepted"),
	REJECTED("Rejected");
	
	 private String value;
	 
	HolidayStatus(String value) {
        this.value = value;
    }
 
    public String getValue() {
        return value;
    }
}
