package com.bbps.billerfetch.data;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class InterchangeFeeDetail implements Serializable { 
    private static final long serialVersionUID = 3230385816485973719L;
	private long tranAmtRangeMax;
    private long tranAmtRangeMin;
    private BigDecimal percentFee;
    private BigDecimal flatFee;
    private String effctvFrom;
    private String effctvTo;
}