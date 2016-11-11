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

	public void setId(Long idIn)
	{
		id = idIn;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String nameIn)
	{
		name = nameIn;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String desc)
	{
		description = desc;
	}

	public int getStock()
	{
		return stock;
	}

	public void setStock(int stk)
	{
		stock = stk;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double p)
	{
		price = p;
	}
}
