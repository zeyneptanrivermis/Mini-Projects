import java.util.Scanner;

public class Abroad {
    public static void main(String[] args) throws InterruptedException, RuntimeException, PoliticalException, VisaException {
        System.out.println("Welcome the airport");
        String menu = "Rules for leaving abroad \n"
                + "You should not have any political ban \n"
                + "You have to pay fee \n"
                + "You have a visa for country you go";
        String message = "You must meet all the conditions";

        while (true) {
            System.out.println(message);
            System.out.println("*****");
            System.out.println(menu);

            Passenger passenger = new Passenger();

            System.out.println("Controlling fee");
            Thread.sleep(3000);
            try {
                passenger.departureFee();
            } catch (FeeException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Controlling political ban");
            Thread.sleep(3000);
            try {
                passenger.politicalBan();
            } catch (PoliticalException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Controlling visa");
            Thread.sleep(3000);
            try {
                passenger.visaCase();
            } catch (VisaException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Your transactions are complete, you can go abroad");
            break;
        }
    }
}

class Passenger implements Rules {
    private int fee;
    private boolean politicalBan;
    private boolean visaCase;

    public Passenger() {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter the fee: ");
        this.fee = scan.nextInt();
        scan.nextLine();

        System.out.println("Do you have a political ban (Yes or No): ");
        String input = scan.nextLine();
        if(input.equals("Yes")) {
            this.politicalBan = true;
        }
        else {
            this.politicalBan = false;
        }

        System.out.println("Dou you have a visa (Yes or No): ");
        String input2 = scan.nextLine();
        if(input2.equals("Yes")) {
            this.visaCase = true;
        }
        else {
            this.visaCase = false;
        }
    }

    @Override
    public boolean departureFee() throws  FeeException {
        if(this.fee < 15) {
            throw new FeeException();
        }
        else {
            System.out.println("The overseas fee transaction is ok");
            return true;
        }
    }

    @Override
    public boolean politicalBan() throws PoliticalException {
        if(this.politicalBan==true) {
            throw new PoliticalException();
        }
        else {
            System.out.println("Political prohibition control is ok");
            return true;
        }
    }

    @Override
    public boolean visaCase() throws VisaException {
        if (!this.visaCase) {
            throw new VisaException();
        } else {
            System.out.println("The visa process is complete");
            return true;
        }
    }
}

interface Rules {
    public boolean departureFee() throws FeeException;
    public boolean politicalBan() throws PoliticalException;
    public boolean visaCase() throws VisaException;
}

class PoliticalException extends Exception {

    public PoliticalException() {
        super("You have political ban");
    }
}

class VisaException extends Exception {

    public VisaException() {
        super("You do not have a visa");
    }
}

class FeeException extends Exception {

    public FeeException() {
        super("Please make a full deposit of the overseas fee");
    }
}

