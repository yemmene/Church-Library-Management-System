package LMS;

import java.util.Date;

public class HoldRequest {
	
	
	    
	    Borrower borrower;
	    Book book;
	    Date requestDate;
	    Staff staff;
	    
	    public HoldRequest(Borrower bor, Book book2, Staff staff, Date requestDate, Date reqDate)  // para cons.
	    {
	        borrower = bor;
	        book = book;
	        requestDate = reqDate;
	    }
	    
	    public HoldRequest(Borrower bor, Book book2, Date reqDate) {
			// TODO Auto-generated constructor stub
		}

		public HoldRequest(Borrower bor, Staff staff, Date reqDate) {
			// TODO Auto-generated constructor stub
		}

		public void HoldRequest(Borrower bor, Staff staff, Date reqDate) {
			// TODO Auto-generated constructor stub
		}

		/*----- Getter FUNCs.--------*/
	    public Borrower getBorrower()
	    {
	        return borrower;
	    }
	    
	    public Book getBook()
	    {
	        return book;
	    }
	    
	    public Date getRequestDate()
	    {
	        return requestDate;
	    }
	    /*--------------------------*/
	    
	    // Print Hold Request Info 
	    public void print()
	    {
	        System.out.print(book.getTitle() + "\t\t\t\t" + borrower.getName() + "\t\t\t\t"  + requestDate + "\n");
	    }
	}// HoldRequest Class Closed
	
	


