package com.vrnda.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="MOBILES")
public class Mobile {
	@Id
	@SequenceGenerator(name = "seq",sequenceName = "PRODUCT_ID",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "seq" ,strategy = GenerationType.AUTO)
	private Long imeNo;
	@Column(length = 20)
	private String companyName;
	@Column(length = 20)
	private String model;
	private Float price;
	private LocalDate dom;
}
