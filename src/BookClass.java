
public class BookClass 
{
	
	private String title ;
	private String author; 
	private String description ;
	private double price;
	
	public BookClass()
	{
//		System.out.println("Book created");

		
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
	
	public double getLineItem(int qty )
	{
		
		System.out.println(String.format(author + "\t" + qty + "\t" + title + "\t" + description + "\t" + price));
		return price;
	}

	
}

