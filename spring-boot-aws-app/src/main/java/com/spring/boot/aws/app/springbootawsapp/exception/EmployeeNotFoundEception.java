package com.spring.boot.aws.app.springbootawsapp.exception;

import java.util.Date;

public class EmployeeNotFoundEception extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String desciption;
	private Date timestamp;
	
	public EmployeeNotFoundEception() {}
	
	public EmployeeNotFoundEception(String errorCode,String desciption,Date timestamp) {
		super(errorCode);
		this.errorCode=errorCode;
		this.desciption=desciption;
		this.timestamp=timestamp;
		
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundEception [errorCode=" + errorCode + ", desciption=" + desciption + ", timestamp="
				+ timestamp + "]";
	}
		

}
