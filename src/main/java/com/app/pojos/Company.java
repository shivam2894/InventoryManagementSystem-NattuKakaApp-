package com.app.pojos;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="companies")
@AttributeOverride(column = @Column(name = "company_id"), name = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Company extends BaseEntity {
	
	@Column(name="name")
	private String companyName;
	
	//SHIVAM: more fields to be added later
	

}
