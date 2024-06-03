package com.example.sample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	
	@Column(name="user_email")
	private String email;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	public User(String _email, String _name, String _password) {
		this.email = _email;
		this.name = _name;
		this.password = _password;
	}

}
