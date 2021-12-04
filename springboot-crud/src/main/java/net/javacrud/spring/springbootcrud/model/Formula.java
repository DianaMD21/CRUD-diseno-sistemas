package net.javacrud.spring.springbootcrud.model;

import java.util.List;

public class Formula {
	private String idProduct;
	private String idFormula;
	private String name;
	private Boolean isActive;
	private List<Product> myPoducts;
	
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getIdFormula() {
		return idFormula;
	}
	public void setIdFormula(String idFormula) {
		this.idFormula = idFormula;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public List<Product> getMyPoducts() {
		return myPoducts;
	}
	public void setMyPoducts(List<Product> myPoducts) {
		this.myPoducts = myPoducts;
	}
}
