package com.bbps.billpayment.data;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String customerMobile;
	private String customerEmail;
	private String customerAdhaar;
	private String customerPan;

}
