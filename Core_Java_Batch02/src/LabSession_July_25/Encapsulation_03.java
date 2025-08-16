package LabSession_July_25;


public class Encapsulation_03 
{
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public String getIsbn() 
	{
		return isbn;
	}
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public boolean isAvailable() 
	{
		return isAvailable;
	}
	public void setAvailable(boolean available) 
	{
		isAvailable = available;
	}
	
	public void issueBook()
	{
		if(isAvailable )
		{
			isAvailable =true;
			System.out.println("Book issued:" + title);
		}
		else
		{
			System.out.println("Book is already available");
		}
	}
	
	public void returnBook()
	{
		if(isAvailable )
		{
			isAvailable =true;
			System.out.println("Book returned:" + title);
		}
		else
		{
			System.out.println("Book is already available");
		}
	}
	
	public static void main(String[] args) 
	{
		Encapsulation_03 obj=new Encapsulation_03();
		obj.setAuthor("Darshi");
		obj.setTitle("where did i go");
		obj.setIsbn("Q123J");
		obj.setAvailable(true);
		
		System.out.println("Title:     "+obj.getTitle());
		System.out.println("Author : " +obj.getAuthor());
		System.out.println("ISBN: "+ obj.getIsbn());
		System.out.println("is Available:"+ obj.isAvailable());
	}
	
}
