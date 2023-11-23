package com.bbps.billerfetch.data;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public  class Group implements Serializable { 
    private static final long serialVersionUID = -6569541974150676833L;
	private List<String> param;
    private List<Group> group;
    private String input;
}