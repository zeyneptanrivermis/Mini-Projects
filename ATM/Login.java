package MiniProjects.ATM;

//  ZEYNEP TANRIVERMİŞ
//  01.02.2024

import java.util.Scanner;

//  this class controls the login 
public class Login {
	
	//  method for name and password true or not
	public boolean login(Account account) {
		
		try (Scanner scan = new Scanner(System.in)) {
			String name, password;
			System.out.println("Enter your username: ");
			name = scan.nextLine();
			System.out.println("Enter your password: ");
			password = scan.nextLine();
			
			//  checking name and password
			if(account.getName().equals(name) && account.getPassword().equals(password)) {
				return true;
			}
			else {
				return false;
			}
		}
	}

}
