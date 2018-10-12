package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Request")
@Inheritance(strategy = InheritanceType.JOINED)
public class Request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "requestId",nullable=false)
	private int requestId;
	@Column(name = "requestDate",nullable=false)
	private Date requestDate;
	@Column(name = "requestStatus",nullable=false)
	private String requestStatus;
	@Column(name = "requestDetail",nullable=false)
	private String requestDetail;
	@Column(name = "reciveDetail",nullable=false)
	private String reciveDetail;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn (name = "stuffid",nullable=false)
	private Stuff stuff;
	public Stuff getStuff() {
		return stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn (name = "Username",nullable=false)
	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Request() { }
	
	public Request(int requestId, Date requestDate, String requestStatus, String requestDetail, String reciveDetail) {
		super();
		this.requestId = requestId;
		this.requestDate = requestDate;
		this.requestStatus = requestStatus;
		this.requestDetail = requestDetail;
		this.reciveDetail = reciveDetail;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getRequestDetail() {
		return requestDetail;
	}

	public void setRequestDetail(String requestDetail) {
		this.requestDetail = requestDetail;
	}

	public String getReciveDetail() {
		return reciveDetail;
	}

	public void setReciveDetail(String reciveDetail) {
		this.reciveDetail = reciveDetail;
	}
	
	
	
	
	
}
