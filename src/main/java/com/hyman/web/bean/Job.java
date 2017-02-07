package com.hyman.web.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hyman.web.bean.key.Jobkey;

@Entity  
@Table(name="t_job")
public class Job implements Serializable{

	private static final long serialVersionUID = -7468795463412050745L;

	@Id
	private Jobkey key;
	@Column(name="name")
	private String name;
	public Jobkey getKey() {
		return key;
	}
	public void setKey(Jobkey key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
