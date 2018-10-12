package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Stuff")
public class Stuff {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stuffid",nullable=false)
	private int stuffid;
	@Column(name="stuffname",nullable=false)
	private String stuffname;
	@Column(name="registerStuffDate",nullable=false)
    private Date registerStuffDate;
	@Column(name="stuffDetail",nullable=false)
    private String stuffDetail;
	@Column(name="stuffStatus",nullable=false)
    private String stuffStatus;
    
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn (name = "CategoryId",nullable=false)
	private Category category;
		
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

	public Stuff() {
		
	}
    
	public Stuff(int stuffid, String stuffname, Date registerStuffDate, String stuffDetail, String stuffStatus) {
		super();
		this.stuffid = stuffid;
		this.stuffname = stuffname;
		this.registerStuffDate = registerStuffDate;
		this.stuffDetail = stuffDetail;
		this.stuffStatus = stuffStatus;
	}
	public int getStuffid() {
		return stuffid;
	}
	public void setStuffid(int stuffid) {
		this.stuffid = stuffid;
	}
	public String getStuffname() {
		return stuffname;
	}
	public void setStuffname(String stuffname) {
		this.stuffname = stuffname;
	}
	public Date getRegisterStuffDate() {
		return registerStuffDate;
	}
	public void setRegisterStuffDate(Date registerStuffDate) {
		this.registerStuffDate = registerStuffDate;
	}
	public String getStuffDetail() {
		return stuffDetail;
	}
	public void setStuffDetail(String stuffDetail) {
		this.stuffDetail = stuffDetail;
	}
	public String getStuffStatus() {
		return stuffStatus;
	}
	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

    
}
