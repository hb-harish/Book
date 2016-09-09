
public class BookApp 
{
	public static void main(String[] args) 
	{
		BookClass b = new BookClass();
		
		b.setTitle("LOTR");
		b.setAuthor("JR Tolkein");
		b.setDesc("Fiction");
		System.out.println(b.getDisplayText());
		
		
	}
	
}
