package com.app.pojos;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@AttributeOverride(name = "id",column = @Column(name="product_id"))
public class Product extends BaseEntity{
	
	@Column(name = "product_name",length = 30,nullable = false,unique = true)
	@NotBlank
	private String productName;
	
	@Min(value = 0,message = "stock value can't be negative")
	private int stocks;
	
	@Enumerated
	@NotNull
	private Unit unit;
	
	@Min(value = 0,message = "Price value can't be negative")
	@NotNull
	@Column(nullable = false)
	private double price;
	
	@Column(name="min_stock")
	@Min(value = 0,message = "Minimum stock value can't be negative")
	private int minStock;
	
	@Column(name="max_stock")
	@Min(value = 0,message = "Maximum stock value can't be negative")
	private int maxStock;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Override
	public String toString() {
		return "Products [id="+getId()+", productName=" + productName + ", category=" + category + ", stocks=" + stocks + ", unit="
				+ unit + ", price=" + price + ", minStock=" + minStock + ", maxStock=" + maxStock + "]";
	}
	
	
	
}
