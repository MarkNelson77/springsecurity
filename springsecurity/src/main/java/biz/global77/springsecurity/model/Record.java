package biz.global77.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "record")
public class Record {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long recordId;
	private long gameId;
	private String date;
	private String time;
	private String description;
	public Record() {
		super();
	}
	public Record(long gameId, String date, String time, String description) {
		super();
		this.gameId = gameId;
		this.date = date;
		this.time = time;
		this.description = description;
	}
	public long getRecordId() {
		return recordId;
	}
	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
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
