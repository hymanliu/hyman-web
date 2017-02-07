package com.hyman.web.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity  
@Table(name="t_test_a")
public class TestA implements Serializable{

	private static final long serialVersionUID = -7468795463412050745L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn//这个注解只能写在主(生成ID)的一端
	private TestB testB;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn//这个注解只能写在主(生成ID)的一端
	private TestC testC;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TestB getTestB() {
		return testB;
	}
	public void setTestB(TestB testB) {
		this.testB = testB;
	}
	public TestC getTestC() {
		return testC;
	}
	public void setTestC(TestC testC) {
		this.testC = testC;
	}
	
}
