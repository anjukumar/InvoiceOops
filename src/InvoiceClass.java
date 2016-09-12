public class InvoiceClass 
{
	private int itemNumber;
	private String title;
	private String description;
	private double price;
	private double q;

	public InvoiceClass()
	{
		System.out.println("Thank You For Shopping with us");
	}
	
	public int getItemNumber()
	{
		return itemNumber;
	}

	public void setItemNumber(int itemNumber)
	{
		this.itemNumber=itemNumber;
	}
	
	
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description=description;
	}
	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price=price;
	}

	public double getQuantity()
	{
		return q;
	}

	public void setQuantity(double q)
	{
		this.q=q;
	}
	
}
