package MiniProjects.ATM;

//ZEYNEP TANRIVERMİŞ
//01.02.2024

import java.util.Scanner;

public class ATM {
	public ATM() {
	}

	public void start(Account account) {

		// creating an object from Login class
		Login login = new Login();

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome our bank");
		System.out.println("-----");

		// defining entry rights
		int attempts = 3;

		while (true) {
			if (login.login(account)) {
				System.out.println("-----");
				System.out.println("Successfully logged in");
				System.out.println("-----");
				break;
			} else {
				System.out.println("-----");
				attempts -= 1;
				System.out.println("Name or password is wrong \n" + "Remaining attempts: " + attempts);
			}
			if (attempts == 0) {
				System.out.println("-----");
				break;
			}
		}

		// defining menu
		String menu = "1- Show Balance \n" + "2- Deposit \n" + "3- Withdraw \n" + "Q- Quit";

		while (true) {
			System.out.println(menu);
			String choice = scan.nextLine();

			if (choice.equalsIgnoreCase("Q")) {
				System.out.println("Exiting...");
				break;
			} else {
				if (choice.equals("1")) {
					System.out.println(account.getBalance());
				} else if (choice.equals("2")) {
					System.out.println("How much money do you want deposit:");
					int amount = Integer.parseInt(scan.next());
					scan.nextLine();
					account.deposit(amount);
				} else if (choice.equals("3")) {
					System.out.println("How much money do you want withdraw:");
					int amount = Integer.parseInt(scan.next());
					scan.nextLine();
					account.withdraw(amount);
				} else {
					System.out.println("Invalid input!");
				}
			}
		}

	}

}
