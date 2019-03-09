package com.ri.gov.ies.admin.cw.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class CaseWorkerModel {
	
	private int caseWorkerId;
	
	private String fName;
	
	private String lName;
	
	private String gender;
	
	private long ssn;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date dob;
	
	private String email;
	
	private String pwd;
	
	private String phno;
	
	private String activeStatus;
	
	private Date createDate;
	
	private Date updateDate;
	
}
