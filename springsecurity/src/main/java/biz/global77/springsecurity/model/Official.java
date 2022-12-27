package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "official")
public class Official {
	
	@Id
	private Integer officialId;
	private String fullname;
	private Boolean access;
	
	public Official() {
		super();
	}
	public Official(String fullname, Boolean access) {
		super();
		this.fullname = fullname;
		this.access = access;
	}
	public Integer getOfficialId() {
		return officialId;
	}
	public void setOfficialId(Integer officialId) {
		this.officialId = officialId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Boolean getAccess() {
		return access;
	}
	public void setAccess(Boolean access) {
		this.access = access;
	}

}
