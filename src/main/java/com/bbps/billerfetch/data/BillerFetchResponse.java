package com.bbps.billerfetch.data;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BillerFetchResponse implements Serializable { 
    private static final long serialVersionUID = 1L;
    private String refId;
	private String responseCode;
    private String responseMessage;
    private String billerId;
    private String billerName;
    private String billerAliasName;
    private String billerCategoryName;
    private String billerMode;
    private boolean billerAcceptsAdhoc;
    private boolean parentBiller;
    private String billerOwnerShp;
    private String billerCoverage;
    private String fetchRequirement;
    private String paymentAmountExactness;
    private String supportBillValidation;
    private String billerEffctvFrom;
    private String billerEffctvTo;
    private String billerTempDeactivationStart;
    private String billerTempDeactivationEnd;
    private List<PaymentMode> billerPaymentModes;
    private List<PaymentChannel> billerPaymentChannels;
    private List<BillerCustomerParam> billerCustomerParams;
    private CustomerParamGroups customerParamGroups;
    private BillerResponseParams billerResponseParams;
    private List<BillerCustomerParam> billerAdditionalInfo;
    private  List<BillerCustomerParam> billerAdditionalInfoPayment;
    private List<InterchangeFeeConf> interchangeFeeConf;
    private List<InterchangeFee> interchangeFee;
    private String Status;
    private String billerDescription;
    private String supportDeemed;
    private String supportPendingStatus;
    private String billerTimeOut;
    private String planMdmRequirement;
    private List<BillerCustomerParam> planAdditionalInfo;
}












