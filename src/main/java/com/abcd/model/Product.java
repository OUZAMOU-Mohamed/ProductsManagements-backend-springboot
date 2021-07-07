package com.abcd.model;

public class Product {

	private Long code;
	private double price;
	private String name;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param code
	 * @param price
	 * @param name
	 */
	public Product(Long code, double price, String name) {
		super();
		this.code = code;
		this.price = price;
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public Long getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Long code) {
		this.code = code;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
