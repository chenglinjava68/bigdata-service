package cn.com.enersun.data_center.bigdata_service.entity;

import java.io.Serializable;


/**
 * 组织机构信息
 * 
 */

public class OrganizationEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	private String org_name;
	
	private String org_code;

	private String name_full_path;
	
	private String short_spell;
	
	private String sort_no;

	
	public OrganizationEntity() {
		super();
	}


	public String getOrg_name() {
		return org_name;
	}


	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}


	public String getOrg_code() {
		return org_code;
	}


	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}


	public String getName_full_path() {
		return name_full_path;
	}


	public void setName_full_path(String name_full_path) {
		this.name_full_path = name_full_path;
	}


	public String getShort_spell() {
		return short_spell;
	}

	public void setShort_spell(String short_spell) {
		this.short_spell = short_spell;
	}

	public String getSort_no() {
		return sort_no;
	}


	public void setSort_no(String sort_no) {
		this.sort_no = sort_no;
	}


	@Override
	public String toString() {
		return "Organization [org_name=" + org_name + ", org_code=" + org_code + ", name_full_path=" + name_full_path
				+ ", short_spell=" + short_spell + ", sort_no=" + sort_no + "]";
	}

	
    
}