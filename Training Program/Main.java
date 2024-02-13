package MiniProjects.TrainingProgram;

//  ZEYNEP TANRIVERMİŞ
//  13.02.2024

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome our training program");
		System.out.println("-----");
		
		String menu = "MENU \n" + "1- Burpee \n" + "2- Push-up \n" + "3- Sit-up \n" + "4- Squat \n";
		
		System.out.println("Create a workout");
		System.out.println("Number of burpee:");
		int burpee = scan.nextInt();
		System.out.println("Number of push-up:");
		int pushup = scan.nextInt();
		System.out.println("Number of sit-up:");
		int situp = scan.nextInt();
		System.out.println("Number of squat:");
		int squat = scan.nextInt();
		scan.nextLine();
		System.out.println("-----");
		
		Training training = new Training(burpee, pushup, situp, squat);
		
		System.out.println("Start your workout");
		
		while(training.isFinish()== false) {
			System.out.println("Choose a type (Burpee, Push-up, Sit-up, Squat)");
			String type = scan.nextLine();
			System.out.println("How many times will you do it?");
			int number = scan.nextInt();
			scan.nextLine();
			
			training.doTraining(type, number);
			System.out.println("-----");
		}
		System.out.println("Congratulations, you have completed your training");
		System.out.println("-----");
	}
}
