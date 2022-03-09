package com.app.pojos;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="categories")
@AttributeOverride(name = "id",column = @Column(name="category_id"))
public class Category extends BaseEntity{
	
	@Column(name = "category_name",length = 30,unique = true)
	private String name;

	@Override
	public String toString() {
		return "Category [id="+getId()+", name=" + name + "]";
	}
	
	
}
