package com.bbps.billfetch.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
@Data
public class BillFetchResponseVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String responseCode;
    private String responseMessage;
    private String refId;
    private String approvalRefNum;
    private InputParams inputParams;
    private String customerName;
    private String amount;
    private String dueDate;
    private String billDate;
    private String billNumber;
    private String billPeriod;
    private List<Tag> billerResponseTag;
    private List<Tag> additionaInfo;
    private String complianceRespCd;
    private String complianceReason;
    
    

}
