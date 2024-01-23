package AppEmail;


public class EmailApp {

	public static void main(String[] args) {
	
		//Scanner class Object 
		
		
		
		//object of email class
		Email e1 = new Email("Deepa","Roy");
		System.out.println(e1.ShowDetails());
		
		Email e2 = new Email("Aish","Rao");
		System.out.println(e2.ShowDetails());
		e2.setMailboxCapacity(100);
		System.out.println(e2.ShowDetails());
		
		Email e3 = new Email("Anis","Sheikh");
		e3.setAltEmailAdd("Anis452@hmail.com");
		System.out.println(e3.getAltEmail());

	}

}
