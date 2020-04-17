package webapp.Jee.service.model;

import java.util.Date ;

public class Todo {
	private int id;
	private String desc;
	private String user;
	private Date targetDate;
	private boolean isDone;
	
	public Todo() {
		
	}
	public Todo(int id, String desc, String user, Date date, boolean isDone) {
		super();
		this.id = id;
		this.desc = desc;
		this.user = user;
		this.targetDate = date;
		this.isDone = isDone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", desc=" + desc + ", user=" + user + ", targetDate=" + targetDate + ", isDone="
				+ isDone + "]";
	}
}
