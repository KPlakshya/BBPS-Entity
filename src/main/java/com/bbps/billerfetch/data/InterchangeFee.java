package com.bbps.billerfetch.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class InterchangeFee implements Serializable { 
    private static final long serialVersionUID = 1L;
	private String feeCode;
    private String feeDesc;
    private String feeDirection;
    private List<InterchangeFeeDetail> interchangeFeeDetails;

    
}
