
public class InvoiceDb {

	public InvoiceClass getInvoice(String sku)
	{
		InvoiceClass db = new InvoiceClass();
		if(sku.equalsIgnoreCase("Java"))
		{
			db.setItemNumber(101);
			db.setTitle("Java 101");
			db.setDescription("\n Easy to read Java workbook");
			db.setPrice(47.50);
			
		}

		if(sku.equalsIgnoreCase("Java 1002"))
		{
			db.setItemNumber(102);
			db.setTitle("Java 102");
			db.setDescription("Details about Java under the hood");
			db.setPrice(20.00);
			

		}
		if(sku.equalsIgnoreCase("Oracle"))
		{
			db.setItemNumber(103);
			db.setTitle("Oracle");
			db.setDescription("EEverything you need to know in one place");
			db.setPrice(45.00);
			
		}
		
		if(sku.equalsIgnoreCase("Python100"))
		{
			db.setItemNumber(104);
			db.setTitle("Python");
			db.setDescription("Fun with Python");
			db.setPrice(27.50);
			
		}
		return db;


	}

}
