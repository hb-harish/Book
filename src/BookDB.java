
public class BookDB {

	public BookClass getBook(String sku)
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
		return b;
	}
	
}
