package MiniProjects.TrainingProgram;

//  ZEYNEP TANRIVERMİŞ
//  13.02.2024

public class Training {
	private int number_burpee;
	private int number_pushup;
	private int number_situp;
	private int number_squat;

	//  constructor
	public Training(int number_burpee, int number_pushup, int number_situp, int number_squat) {
		this.number_burpee = number_burpee;
		this.number_pushup = number_pushup;
		this.number_situp = number_situp;
		this.number_squat = number_squat;
	}

	//  getter and setter methods
	public int getNumber_burpee() {
		return number_burpee;
	}

	public void setNumber_burpee(int number_burpee) {
		this.number_burpee = number_burpee;
	}

	public int getNumber_pushup() {
		return number_pushup;
	}

	public void setNumber_pushup(int number_pushup) {
		this.number_pushup = number_pushup;
	}

	public int getNumber_situp() {
		return number_situp;
	}

	public void setNumber_situp(int number_situp) {
		this.number_situp = number_situp;
	}

	public int getNumber_squat() {
		return number_squat;
	}

	public void setNumber_squat(int number_squat) {
		this.number_squat = number_squat;
	}

	public void doTraining(String type, int number) {
		if (type.equals("Burpee")) {
			doBurpee(number);
		} 
		else if (type.equals("Push-up")) {
			doPushup(number);
		} 
		else if (type.equals("Sit-up")) {
			doSitup(number);
		} 
		else if (type.equals("Squat")) {
			doSquat(number);
		} 
		else {
			System.out.println("Invalid type");
		}
	}

	public void doBurpee(int number) {
		if(number_burpee == 0) {
			System.out.println("There is not burpee");
		}
		else if(number>number_burpee) {
			System.out.println("You have passed the number of burpees you were aiming for, congratulations");
			number_burpee = 0;
		}
		else {
			number_burpee -= number;
			System.out.println("Remaining burpee: " + number_burpee);
		}
	}
	
	public void doPushup(int number) {
		if(number_pushup == 0) {
			System.out.println("There is not push-up");
		}
		else if(number>number_pushup) {
			System.out.println("You have passed the number of push-up you were aiming for, congratulations");
			number_pushup = 0;
		}
		else {
			number_pushup -= number;
			System.out.println("Remaining push-up: " + number_pushup);
		}
	}
	
	public void doSitup(int number) {
		if(number_situp == 0) {
			System.out.println("There is not sit-up");
		}
		else if(number>number_situp) {
			System.out.println("You have passed the number of sit-up you were aiming for, congratulations");
			number_situp = 0;
		}
		else {
			number_situp -= number;
			System.out.println("Remaining sit-up: " + number_situp);
		}
	}
	
	public void doSquat(int number) {
		if(number_squat == 0) {
			System.out.println("There is not squat");
		}
		else if(number>number_squat) {
			System.out.println("You have passed the number of squat you were aiming for, congratulations");
			number_squat = 0;
		}
		else {
			number_squat -= number;
			System.out.println("Remaining squat: " + number_squat);
		}
	}
	
	public Boolean isFinish() {
		return (number_burpee==0 && number_pushup==0 && number_situp==0 && number_squat==0);
	}
}
