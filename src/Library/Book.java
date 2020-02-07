package Library;
public class Book {
private String ISBN;
private String A;
private String Title;
private String Author;
private int Edition;
private int PublishedYear;
private boolean Borrowed;

public void setISBN(String ISBN)
{
	if(ISBN.length()!=10)
		this.ISBN="1111111111";
	else
		this.ISBN=ISBN;
}

public String getISBN()
{
	return ISBN;
}



public void setTitle(String Title)
{
	this.Title = Title;
}

public String getTitle()
{
	return Title;
}

public void setAuthor(String Author)
{
	this.Author=Author;
}


public String getAuthor()
{
	return Author;
}

public void setBorrowed(boolean Borrowed)
{
	this.Borrowed=Borrowed;
}

public boolean getBorrowed()
{
	return Borrowed;
}

public void setPublishedYear(int PublishedYear)
{
	this.PublishedYear=PublishedYear;
}

public int getPublishedYear()
{
	return PublishedYear;
}

public void setEdition(int Edition)
{
	this.Edition=Edition;
}

public int getEdition()
{
	return Edition;
}


}
