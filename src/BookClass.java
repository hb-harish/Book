
public class BookClass 
{
	
	String title, author, description;
	double price;
	
	public BookClass()
	{
		System.out.println("Book created");
		
	}
	
	public BookClass( String name)
	{
		title = name ;
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
	public String getDisplayText()
	{
		return String.format("Details: " + author + " " + title + " " + description);
	}
	public String getTitle()
	{
		return title;
	}
	
}

