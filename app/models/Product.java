package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Product extends Model {

	//Properties
	@Id
	private Long id;

	@Constraints.Required
	private String name;
	
	@Constraints.Required
	private String description;

	@Constraints.Required
	private int stock;

	@Constraints.Required
	private double price;
	
	//Default constructor
	public Product(){		
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

	//Generic query helper for entity Computer with id long
	public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);

	//Find all Products in the database
	//Filter Product name
	public static List<Product> findAll()
	{
		return Product.find.all();
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
