package com.bw.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Job {

	private Integer jid;
	private String jname;
	private Integer start;
	private Integer end;
	private String introduction;
	private Integer story1;
	private Integer story2;
	private Integer story3;
	@DateTimeFormat
	private Date startdate;
	private String lname;
	private String sname;
	private String lname1;
	private String lname2;
	private String lname3;
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Integer getStory1() {
		return story1;
	}
	public void setStory1(Integer story1) {
		this.story1 = story1;
	}
	public Integer getStory2() {
		return story2;
	}
	public void setStory2(Integer story2) {
		this.story2 = story2;
	}
	public Integer getStory3() {
		return story3;
	}
	public void setStory3(Integer story3) {
		this.story3 = story3;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLname1() {
		return lname1;
	}
	public void setLname1(String lname1) {
		this.lname1 = lname1;
	}
	public String getLname2() {
		return lname2;
	}
	public void setLname2(String lname2) {
		this.lname2 = lname2;
	}
	public String getLname3() {
		return lname3;
	}
	public void setLname3(String lname3) {
		this.lname3 = lname3;
	}
	public Job(Integer jid, String jname, Integer start, Integer end, String introduction, Integer story1,
			Integer story2, Integer story3, Date startdate, String lname, String sname, String lname1, String lname2,
			String lname3) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.start = start;
		this.end = end;
		this.introduction = introduction;
		this.story1 = story1;
		this.story2 = story2;
		this.story3 = story3;
		this.startdate = startdate;
		this.lname = lname;
		this.sname = sname;
		this.lname1 = lname1;
		this.lname2 = lname2;
		this.lname3 = lname3;
	}
	public Job() {
		super();
	}
	@Override
	public String toString() {
		return "Job [jid=" + jid + ", jname=" + jname + ", start=" + start + ", end=" + end + ", introduction="
				+ introduction + ", story1=" + story1 + ", story2=" + story2 + ", story3=" + story3 + ", startdate="
				+ startdate + ", lname=" + lname + ", sname=" + sname + ", lname1=" + lname1 + ", lname2=" + lname2
				+ ", lname3=" + lname3 + "]";
	}
	
	
}
