import java.util.Scanner;

public class BookApp 
{
	public static void main(String[] args) 
	{
		BookDB db = new BookDB();

		System.out.println("Enter an sku");
		Scanner sc = new Scanner(System.in);
		String sku = sc.nextLine();
		BookClass b = db.getBook(sku);
		System.out.println(b.getDisplayText());
		
		
	
		
		//System.out.println(b.getDisplayText());
	
		
		
	}
	
}
