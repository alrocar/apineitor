package com.apineitor.meetup.params;

public class DefaultParams {

	private String fields;
	private String order;
	private String page = "999";
	private String offset;
	private String desc;
	private String only;
	private String omit;

	public DefaultParams() {
	}

	public DefaultParams(String fields, String order, String page,
			String offset, String desc, String only, String omit) {
		super();
		this.fields = fields;
		this.order = order;
		this.page = page;
		this.offset = offset;
		this.desc = desc;
		this.only = only;
		this.omit = omit;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOnly() {
		return only;
	}

	public void setOnly(String only) {
		this.only = only;
	}

	public String getOmit() {
		return omit;
	}

	public void setOmit(String omit) {
		this.omit = omit;
	}

}
