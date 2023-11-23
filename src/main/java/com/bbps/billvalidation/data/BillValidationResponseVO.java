package com.bbps.billvalidation.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BillValidationResponseVO implements Serializable {
	private static final long serialVersionUID = -4391848176183490171L;
	private String refId;
	private String responseCode;
	private String responseMessage;
	private String complianceRespCd;
	private String complianceReason;
	private String approvalRefNum;
	private List<AdditionalInfo> additionaInfo;
}
