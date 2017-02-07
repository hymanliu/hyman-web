package com.hyman.web.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity  
@Table(name="t_test_b")
public class TestB implements Serializable{

	private static final long serialVersionUID = -7468795463412050745L;

	@Id
	@GenericGenerator(name="pkGenerator",strategy="foreign",parameters={@Parameter(name="property",value="testA")})
	@GeneratedValue(generator="pkGenerator")
	private Integer id;
	
	@Column(name="remarks")
	private String remarks;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="testB")
	private TestA testA;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public TestA getTestA() {
		return testA;
	}
	public void setTestA(TestA testA) {
		this.testA = testA;
	}
	
}
