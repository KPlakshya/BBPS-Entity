package com.bbps.billerfetch.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class AmountOption implements Serializable {
	private static final long serialVersionUID = 2976434492907662643L;
	private List<String> amountBreakupSet;
}