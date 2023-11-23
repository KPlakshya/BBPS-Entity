package com.bbps.billpayment.data;

import java.io.Serializable;

import lombok.Data;

@Data
public class BillDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private String billerId;
	private InputParams inputParams;

}
