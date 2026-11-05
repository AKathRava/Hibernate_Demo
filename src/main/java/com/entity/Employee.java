package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_info")

public class Employee {
	
	@Column(name="emp_id")
	@Id
	private int id;
	
	@Column(name="emp_name",unique=true)
	private String name;
	
	@Column(name="emp_dep")
	private String dep;

}
