package week2.day1assignment;

public class Library {
	
	
	public void addBook(String bookTitle) {
		
		System.out.println(bookTitle);
		
		
		
	}
	public String addBook() {
		
		return "bookTitle";
		
	}
	
	public void issueBook() {
		System.out.println("Book issue Successfully");
	}

    public static void main(String[]args) {
    	
    	Library book = new  Library();
    	
        book.addBook("Book added Successfully");
    	 String result= book.addBook();
    	 System.out.println(result);
    	 
    	 book.issueBook();
    }
	

}

 