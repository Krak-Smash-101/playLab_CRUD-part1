package models;

public class Product {

	//Properties
	Private Long id;
	Private String name;
	Private String description;
	Private int stock;
	Private double price;
	
	//Default constructor
	Public Product()
	{		

	}

	//Constructor to inititalise
	public Product(Long id, String name, String description, int stock, double price)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.stock = stock;
		this.price = price;		
	}

	public Long getId()
	{
		return id;
	}

	public void setId()
	{
		this.id = id;
	}

	public Long getName()
	{
		return name;
	}
