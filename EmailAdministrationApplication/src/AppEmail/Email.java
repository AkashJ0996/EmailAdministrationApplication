package AppEmail;
import java.util.*;

public class Email {
    Scanner sc = new Scanner(System.in);
	private String FirstName ;
	private String LastName ;
	private String Password ;
	private String Department ;
	private String Email ;
	private int MailboxCapacity=500;
	private int DefaultPasswordLength = 8;
	private String AlternateEmailId ;
	private String compsuffix="itvedantpvt.in";
	
	
	//Constructor to recieve Firstname and Lastname.
	public Email(String firstName, String lastName) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		
		//Calling method to set the Department
		this.Department = setDepartment();
		
		
		//calling set password method
		this.Password = randomPassword(DefaultPasswordLength);
		System.out.println("Password : "+this.Password);
		
		//Combine Email ELement 
		this.Email=FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+Department+"."+compsuffix; 
		
	}
	
	//Ask for department 
    private String setDepartment() {
    	System.out.print("New Employee "+FirstName+" Department code  \n 1.For Sales \n 2.For Development \n 3.For Accounts \n 0.For None"+
    "\nAdd Department Code : ");
    	int DepCode = sc.nextInt();
    	if(DepCode == 1){ return "Sales"; }
    	else if(DepCode == 2){ return "dev"; }
    	else if(DepCode == 3){ return "acct"; }
    	else {return " ";}
    }
	
    //Generate Random Password
    private String randomPassword(int length) {
    	String SetPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%&*!";
    	char password [] = new char[length];
    	for(int i = 0 ; i<length ;i++) {
    		int rand = (int)(Math.random()*SetPassword.length());
    		password[i]= SetPassword.charAt(rand);
    	}
    	return new String(password);
    	
    }
    
    //Set mailbox Capacity 
    public void setMailboxCapacity(int Capacity) {
    	this.MailboxCapacity = Capacity ;
    }
    //Set Alternate Email Address 
    public void setAltEmailAdd(String AltEmail) {
    	this.AlternateEmailId = AltEmail ;
    }
    //Set New Password
    public void setNewPws(String pws) {
    	this.Password = pws ;
    }
	
    public int getMailboxCapacity() {return MailboxCapacity ;}
    public String getAltEmail() {return AlternateEmailId ;}
    public String getchangedpws() {return Password ;}
    
    public String ShowDetails() {
    	return "Name: "+ FirstName +" "+ LastName + " "+
    			"\nompany Email: "+Email+" "+
    			"\nMailbox Capacity : "+MailboxCapacity+"mb";
    	
    }
   
}
