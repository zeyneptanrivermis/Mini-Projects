package MiniProjects.ATM;

//  ZEYNEP TANRIVERMİŞ
//  01.02.2024

import java.util.Scanner;

public class ATM {

	public void start(Account account) {

		//  creating an object from Login class
		Login login = new Login();

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome our bank");
		System.out.println("-----");

		//  defining attempts
		int attempts = 3;

		while (true) {
			if (login.login(account)) {
				System.out.println("-----");
				System.out.println("Successfully logged in");
				System.out.println("-----");
				//  defining menu
				String menu = "1- Show Balance \n" + "2- Deposit \n" + "3- Withdraw \n" + "Q- Quit";

				while (true) {
					System.out.println(menu);
					String choice = scan.next();
					scan.nextLine();

					if (choice.equalsIgnoreCase("Q")) {
						System.out.println("-----");
						System.out.println("Exiting...");
						return;
					} 
					else {
						if (choice.equals("1")) {
							System.out.println("-----");
							System.out.println(account.getBalance());
							System.out.println("-----");
						} 
						else if (choice.equals("2")) {
							System.out.println("-----");
							System.out.println("How much money do you want deposit:");
							int amount = Integer.parseInt(scan.next());
							scan.nextLine();
							account.deposit(amount);
							System.out.println("-----");
						} 
						else if (choice.equals("3")) {
							System.out.println("-----");
							System.out.println("How much money do you want withdraw:");
							int amount = Integer.parseInt(scan.next());
							scan.nextLine();
							account.withdraw(amount);
							System.out.println("-----");
						} 
						else {
							System.out.println("-----");
							System.out.println("Invalid input!");
						}
					}
				}
			} 
			else {
				System.out.println("-----");
				attempts -= 1;
				System.out.println("Name or password is wrong \n" + "Remaining attempts: " + attempts);
				System.out.println("-----");
				if (attempts == 0) {
					System.out.println("-----");
					break;
				}
			}
		}

	}

}
