package com.kingbosky.commons.model.result;

import com.kingbosky.commons.model.BaseObject;

public class BaseResult extends BaseObject{
	private static final long serialVersionUID = -2156435211959393933L;
	private static final String SUCCESS_CODE     = "200";
    private static final String SUCCESS_MSG      = "success";
	private boolean success;
	private String code;
	private String msg;
	
	public BaseResult() {
		this.success = true;
		this.code = SUCCESS_CODE;
		this.msg = SUCCESS_MSG;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
