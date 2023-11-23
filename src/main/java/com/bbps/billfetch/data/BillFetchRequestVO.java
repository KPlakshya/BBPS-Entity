package com.bbps.billfetch.data;

import java.io.Serializable;

import lombok.Data;
@Data
public class BillFetchRequestVO implements Serializable {

	private static final long serialVersionUID = 1L;

	public String directBillChannel;
	public String agentId;
	public AgentDeviceInfo agentDeviceInfo;
	public CustomerInfo customerInfo;
	public String billerId;
	public InputParams inputParams;

}
