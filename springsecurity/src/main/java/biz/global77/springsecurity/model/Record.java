package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "record")
public class Record {
	
	@Id
	private Integer recordId;
	private Integer gameId;
	private String date;
	private String time;
	private String description;
	public Record() {
		super();
	}
	public Record(Integer gameId, String date, String time, String description) {
		super();
		this.gameId = gameId;
		this.date = date;
		this.time = time;
		this.description = description;
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
