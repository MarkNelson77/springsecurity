package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "result")
public class Result {
	
	@Id
	private Integer resultId;
	private Integer recordId;
	private Integer teamId;
	private Integer officialId;
	private Integer score;
	public Result() {
		super();
	}
	public Result(Integer recordId, Integer teamId, Integer officialId, Integer score) {
		super();
		this.recordId = recordId;
		this.teamId = teamId;
		this.officialId = officialId;
		this.score = score;
	}
	public Integer getResultId() {
		return resultId;
	}
	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public Integer getOfficialId() {
		return officialId;
	}
	public void setOfficialId(Integer officialId) {
		this.officialId = officialId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
}
