package com.bbps.billpayment.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
@Data
public class InputParams implements Serializable{

	private static final long serialVersionUID = 1L;
	 private List<InputParam> input;
}
