package com.ri.gov.ies.admin.cw.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
@Entity(name="caseWokerEntity")
@Table(name="CW_MASTER")
public class CaseWorkerEntity {
	
	@Id
	@GeneratedValue
	@Column(name="CW_ID")
	private int caseWorkerId;
	
	@Column(name="CW_FNAME")
	private String fName;
	
	@Column(name="CW_LNAME")
	private String lName;
	
	@Column(name="CW_GENDER")
	private String gender;
	
	@Column(name="CW_SSN")
	private long ssn;
	
	@Column(name="CW_DOB")
	private Date dob;
	
	@Column(name="CW_EMAIL")
	private String email;
	
	@Column(name="CW_PWD")
	private String pwd;
	
	@Column(name = "CW_PHNO")
	private String phno;
	
	@Column(name="CW_ACT")
	private String activeStatus;
	
	@CreationTimestamp
	@Column(name="CW_CR_DT")
	private Date createDate;
	
	@UpdateTimestamp
	@Column(name="CW_UP_DT")
	private Date updateDate;
	
}
