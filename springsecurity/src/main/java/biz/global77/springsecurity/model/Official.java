package biz.global77.springsecurity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "official")
public class Official {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer officialId;
	private String fullname;
	private Boolean access;
	
	@OneToMany(mappedBy = "official")
	private List<Result> results;
	
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
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}

}
