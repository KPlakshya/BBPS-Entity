package com.bbps.billfetch.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class AgentDeviceInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	 public List<Tag> tag;

}
