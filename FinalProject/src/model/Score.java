package model;

import javax.persistence.*;

@Entity
@Table(name = "Score")
@PrimaryKeyJoinColumn(name="username")
public class Score extends User{

	
	@Column(name  = "totalscore",nullable=false)
	private int totalscore;
	@Column(name  = "countUser",nullable=false)
	private int countUser;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Username",nullable = false,unique = true)
	private  User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Score() {
		
	}
	public Score(int totalscore, int countUser) {
		super();
		this.totalscore = totalscore;
		this.countUser = countUser;
	}
	public int getTotalscore() {
		return totalscore;
	}
	public void setTotalscore(int totalscore) {
		this.totalscore = totalscore;
	}
	public int getCountUser() {
		return countUser;
	}
	public void setCountUser(int countUser) {
		this.countUser = countUser;
	}
	
	
	
	
}
