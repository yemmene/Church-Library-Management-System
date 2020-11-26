package LMS;

public class Librarian {
	
	int officeNo;     //Office Number of the Librarian
	public Object getID;
    public static int currentOfficeNumber = 0;
     
    public Librarian(int id,String n, String a, int p, double s,int of) // 
    {
        super();

        if(of == -1)
            officeNo = currentOfficeNumber;        
        else
            officeNo = of;
        
        currentOfficeNumber++;
    }
    
    // Printing Librarian's Info
    public void printInfo()
    {
        
        System.out.println("Office Number: " + officeNo);
    }

	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}   

	
	
	
	

}
