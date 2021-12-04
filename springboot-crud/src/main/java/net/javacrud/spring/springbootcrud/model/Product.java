package net.javacrud.spring.springbootcrud.model;

import java.util.List;

public class Product {
	private String idProduct;
	private String nameProduct;
	private Boolean isCreated;
	private List<Formula> myFormulas;
	
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
