package com.microservices.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String emailId;
	private String name;
	private String username;
	private String password;
	private String role;

	public User(String emailId, String name, String username, String password, String role) {
		this.emailId = emailId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
	}
}
