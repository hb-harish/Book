import java.util.Scanner;


public class InvoiceApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tax rate");
		double tax = sc.nextDouble();
		String o;
		int c =0;
		String[] sku = new String[100];
		int[] qty = new int[100];
 		
		
		do 
		{
			System.out.println("\nEnter sku and qty purchased");
			sku[c] = sc.next();
			qty[c] = sc.nextInt();
			c++;
			System.out.println("\nMore entries ? \"y\" or \"n\"");
			o = sc.next();
			
		}while(o.equals("y"));
		c--;
		
		System.out.println("\n\tInvoice\n\nAuthor\tQty\tTitle\t\tDescription\t\tPrice\n");
		double sum =0;
		do 
		{
			
			BookDB db = new BookDB();
			BookClass b = db.getBook(sku[c]);
			sum = sum + qty[c] * b.getLineItem(qty[c]);
			c--;
		}while(c>=0);
		
		System.out.printf("\n\nSubtotal \t: %.2f\n", sum);
		System.out.printf("Tax \t\t: %.2f\n", tax*sum);
		System.out.printf("Grand Total  \t: %.2f\n", (tax*sum + sum));
		
		
	}
	

}
