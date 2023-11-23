package com.bbps.billpayment.data;

import java.io.Serializable;

import lombok.Data;

@Data
public class InputParam implements Serializable {
	private static final long serialVersionUID = 1L;
	private String paramName;
	private String paramValue;
}
