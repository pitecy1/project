package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "User")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

		@Id
		@Column(name = "Username",nullable=false)
		private String Username;
		@Column(name = "Password",nullable=false)
		private String Password;
		@Column(name = "Name",nullable=false)
		private String Name;
		@Column(name = "Address",nullable=false)
		private String Address;
		@Column(name = "Email",nullable=false)
		private String Email;
		@Column(name = "userStatus")
		private String userStatus;
		
		public User() {	}
		
		public User(String username, String password, String name, String address, String email) {
			super();
			Username = username;
			Password = password;
			Name = name;
			Address = address;
			Email = email;
		}

		public String getUsername() {
			return Username;
		}

		public void setUsername(String username) {
			Username = username;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getUserStatus() {
			return userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}
		
		
		
		
}
