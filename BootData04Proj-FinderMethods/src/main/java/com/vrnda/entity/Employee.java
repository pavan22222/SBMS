package com.vrnda.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@Column
	@SequenceGenerator(name = "stSeq",sequenceName = "STD",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "stSeq",strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer age;
	@Column
	private float salary;
	@Column
	@Version
	private Integer version;
	@Column
	private String designation;
	@Column
	private Date doj;
	@Column
	@CreationTimestamp
	private Date creationDate;
	@Column
	@UpdateTimestamp
	private Date lastUpdationDate;
}
