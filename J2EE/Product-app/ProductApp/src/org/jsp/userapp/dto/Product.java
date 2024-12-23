package org.jsp.userapp.dto;

public class Product {
	private int id;
	private String name;
	private String brand;
	private String category;
	private String description;
	private double cost;
	private String imageurl;
	
	public Product(int id, String name, String brand, String category, String description, double cost,
			String imageurl) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.cost = cost;
		this.imageurl = imageurl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	
}
