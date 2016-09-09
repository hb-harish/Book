
public class BookClass 
{
	
	private String title ;
	private String author; 
	private String description ;
	private double price;
	
	public BookClass()
	{
		System.out.println("Book created");

		
	}
	
	public BookClass( String titl, String auth, String des, double p )
	{
		title = titl ;
		author = auth ;
		description = des;
		price = p;
		
		System.out.println("Book titled \"" + title + "\" has been created ");
	}
	public void setTitle(String name)
	{
		title = name ;
	}
	public void setAuthor(String name)
	{
		author = name ;
	}
	public void setDesc(String name)
	{
		description = name;
	}
	public void setPrice(double p)
	{
		price = p;
	}
	public String getDisplayText()
	{
		return String.format("Details: " + author + " " + title + " " + description + " " + price);
	}
	public String getTitle()
	{
		return title;
	}
//	public void checkStock(String titl,int qty)
//	{
//		double price2 = 0;
//		int q = 0;
//		for (int j=0; j<=i; j++)
//		{
//			if (title.equals(titl))
//			{
//				q++;
//				price2 = price;
//				System.out.println("Found "+ getDisplayText(j));
//			}
//		}
//		System.out.println ("Found " + q + "number");
//		if (q<=qty)
//			System.out.println("The price of " + qty + "books is :" + (price2)*qty );
//		else 
//		{
//			System.out.println("There are not enough books but");
//			System.out.println("The price of " + q + "books is :" + (price2)*q );
//		}
//		
//	}
	
}

