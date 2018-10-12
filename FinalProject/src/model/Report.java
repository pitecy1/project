package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Report")
public class Report {
	
	@Column(name = "reportId")
	@Id
	private int reportId;
	@Column(name = "reportDetail")
	private String reportDetail;
	@Column(name = "reportDate")
	private Date reportDate;
	
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn (name = "Username")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Report() {
		
	}
	public Report(int reportId, String reportDetail, Date reportDate) {
		super();
		this.reportId = reportId;
		this.reportDetail = reportDetail;
		this.reportDate = reportDate;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public String getReportDetail() {
		return reportDetail;
	}
	public void setReportDetail(String reportDetail) {
		this.reportDetail = reportDetail;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	
	
	
	
}
