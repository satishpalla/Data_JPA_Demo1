package com.example.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYERDATA")
public class Player {
@Id
	@Column
	private Integer p_id;
	
@Column	
private String p_name;
@Column(name="player_age")
private Integer p_age;

@Column
private String p_gender;

public Integer getP_id() {
	return p_id;
}

public void setP_id(Integer p_id) {
	this.p_id = p_id;
}

public String getP_name() {
	return p_name;
}

public void setP_name(String p_name) {
	this.p_name = p_name;
}

public Integer getP_age() {
	return p_age;
}

public void setP_age(Integer p_age) {
	this.p_age = p_age;
}

public String getP_gender() {
	return p_gender;
}

public void setP_gender(String p_gender) {
	this.p_gender = p_gender;
}

@Override
public String toString() {
	return "Player [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + ", p_gender=" + p_gender + "]";
}

	
	
	
}
