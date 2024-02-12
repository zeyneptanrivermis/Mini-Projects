package MiniProjects.ATM;

//ZEYNEP TANRIVERMİŞ
//01.02.2024

public class Main {

	public static void main(String[] args) {
		
		//  creating an object from ATM class
		ATM atm = new ATM();
		
	    //  creating an object from Account class
		Account account = new Account("Zeynep Tanrivermis", "2004", 5000);
		
		atm.start(account);
		
		System.out.println("Successfully logged out");
	}

}
