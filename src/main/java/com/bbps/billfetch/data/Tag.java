package com.bbps.billfetch.data;

import java.io.Serializable;

import lombok.Data;

@Data
public class Tag implements Serializable{
	private static final long serialVersionUID = 1L;
	public String name;
    public String value;
}
