package com.bbps.billpayment.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BillPaymentResponse implements Serializable {

	private static final long serialVersionUID = 4034406183765434280L;

	private String siTxn;
	private String origRefId;
	private String refId;
	private String responseCode;
	private String responseMessage;
	private String complianceRespCd;
	private String complianceReason;
	private String approvalRefNum;
	private String txnReferenceId;
	private String txnTs;
	private String txnMsgId;
	private BillDetails billDetails;
	private BillerResponse billerResponse;
	private List<AdditionalInfo> additionaInfo;

}
