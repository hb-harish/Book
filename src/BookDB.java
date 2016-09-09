
public class BookDB {

	public BookDB (String sku)
	{
		BookClass b = new BookClass();
		if (sku.equals("java1001"))
		{
			b.setAuthor("Murach");
			b.setTitle("Java");
			b.setDesc("Java book");
			b.setPrice(49.95);
		}
		if (sku.equals("lotr"))
		{
			b.setAuthor("JR");
			b.setTitle("LOTR");
			b.setDesc("Fiction");
			b.setPrice(189.95);
		}
		if (sku.equals("hp"))
		{
			b.setAuthor("JKR");
			b.setTitle("Harry Potter");
			b.setDesc("Kids");
			b.setPrice(129.95);
		}
		
		System.out.println(b.getDisplayText());
	}	
	
	public BookDB() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public BookClass getBook(String sku)
	{
		BookClass b = new BookClass();
		if (sku.equals("java"))
		{
			b.setAuthor("Murach");
			b.setTitle("Java Basic");
			b.setDesc("Programming help");
			b.setPrice(49.95);
		}
		if (sku.equals("lotr"))
		{
			b.setAuthor("JR");
			b.setTitle("LOTR all parts");
			b.setDesc("Fiction entertainer");
			b.setPrice(189.95);
		}
		if (sku.equals("hp"))
		{
			b.setAuthor("JKR");
			b.setTitle("Harry Potter");
			b.setDesc("The boy who lived");
			b.setPrice(129.95);
		}
		return b;
	}
	
}
