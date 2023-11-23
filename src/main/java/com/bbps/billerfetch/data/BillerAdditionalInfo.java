package com.bbps.billerfetch.data;

import java.io.Serializable;

import lombok.Data;

@Data
public class BillerAdditionalInfo implements Serializable { 
    private static final long serialVersionUID = 1L;
	private String paramName;
    private String dataType;
    private boolean optional;
}
