package net.javacrud.spring.springbootcrud.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Product")

public class Product {
	@Column(name="IdProduct")
	private String idProduct;
	@Column(name="NameProduct")
	private String nameProduct;
	@Column(name="IsCreated")
	private Boolean isCreated;
	@Column(name="MyFormulas")
	private List<Formula> myFormulas;
	
	public Product(String idProduct, String nameProduct, Boolean isCreated, List<Formula> myFormulas) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.isCreated = isCreated;
		this.myFormulas = myFormulas;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public Boolean getIsCreated() {
		return isCreated;
	}
	public void setIsCreated(Boolean isCreated) {
		this.isCreated = isCreated;
	}
	public List<Formula> getMyFormulas() {
		return myFormulas;
	}
	public void setMyFormulas(List<Formula> myFormulas) {
		this.myFormulas = myFormulas;
	}
}
