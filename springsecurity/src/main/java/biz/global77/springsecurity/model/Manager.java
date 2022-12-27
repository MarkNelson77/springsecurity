package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Manager {
	
	@Id
	private Integer managerId;
	private Integer teamId;
	private String fullname;
	private Boolean access;
	public Manager() {
		super();
	}
	public Manager(Integer teamId, String fullname, Boolean access) {
		super();
		this.teamId = teamId;
		this.fullname = fullname;
		this.access = access;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
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
