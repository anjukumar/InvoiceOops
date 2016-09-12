import java.util.Scanner;
public class InvoiceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=100;i++)
		{
			System.out.println("Do you want to add a new item \"YES\" or \"No\"");
			String resp=sc.nextLine();
			if(resp.equalsIgnoreCase("yes"))
			{
				System.out.println("\n Enter an SKU:  ");
				String sku=sc.nextLine();


				System.out.println("Enter the Item Quantity : ");
				int q=sc.nextInt();

				InvoiceDb db = new InvoiceDb();
				InvoiceClass db1 = db.getInvoice(sku);

				System.out.println("Title " +db1.getTitle());
				System.out.println("Description : " +db1.getDescription());
				System.out.println("Item Number :  "+db1.getItemNumber());
				System.out.println("Price:  "+ db1.getPrice()*q);
				System.out.println(" Quantity :  " +q);
			}
			else if(resp.equalsIgnoreCase("no"))
			{
			System.out.println("You have no more enteries");
			break;
			}
		}
		sc.close();
	}


}
