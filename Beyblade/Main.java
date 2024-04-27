//  ZEYNEP TANRIVERMİŞ
//  28.04.2024


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Beyblade program");
        System.out.println("Enter Q for quit");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Which Beyblade do you want to generate?");
            String input = scanner.nextLine();

            if (input.equals("Q")) {
                System.out.println("Exiting...");
                break;
            }
            else {
                BeybladeFabrica beybladeFabrica = new BeybladeFabrica();
                Beyblade beyblade = beybladeFabrica.generateBeyblade(input);

                if(beyblade==null) {
                    System.out.println("Enter a valid beyblade name");
                }
                else {
                    beyblade.showDetails();
                    beyblade.attack();
                    beyblade.hasMonster();
                }
            }
        }
    }
}

class Beyblade {
    private String name;
    private int speedOfTurn;
    private int powerOfAttack;

    public Beyblade(String name, int speedOfTurn, int powerOfAttack) {
        this.name = name;
        this.speedOfTurn = speedOfTurn;
        this.powerOfAttack = powerOfAttack;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeedOfTurn() {
        return speedOfTurn;
    }
    public void setSpeedOfTurn(int speedOfTurn) {
        this.speedOfTurn = speedOfTurn;
    }
    public int getPowerOfAttack() {
        return powerOfAttack;
    }
    public void setPowerOfAttack(int powerOfAttack) {
        this.powerOfAttack = powerOfAttack;
    }

    public void attack() {
        System.out.println(getName() +  " attacks with " + powerOfAttack + " and " + speedOfTurn);
    }

    public void hasMonster() {
        System.out.println("This beyblade has not a monster");
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Speed of turn: " + speedOfTurn);
        System.out.println("Power of attack: " + powerOfAttack);
    }
}

class Dranza extends Beyblade {
    private String monster;

    public Dranza(String name, int speedOfTurn, int powerOfAttack, String monster) {
        super(name, speedOfTurn, powerOfAttack);
        this.monster = monster;
    }

    @Override
    public void hasMonster() {
        System.out.println(getName() + " is using " + monster);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Name of monster: " + monster);
    }
}

class Drayga extends Beyblade {
    private String monster;

    public Drayga(String name, int speedOfTurn, int powerOfAttack, String monster) {
        super(name, speedOfTurn, powerOfAttack);
        this.monster = monster;
    }

    @Override
    public void hasMonster() {
        System.out.println(getName() + " is using " + monster);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Name of monster: " + monster);
    }
}

class Draciel extends Beyblade {
    private String monster;

    public Draciel(String name, int speedOfTurn, int powerOfAttack, String monster) {
        super(name, speedOfTurn, powerOfAttack);
        this.monster = monster;
    }

    @Override
    public void hasMonster() {
        System.out.println(getName() + " is using " + monster);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Name of monster: " + monster);
    }
}

class Dragon extends Beyblade {
    private String monster;
    private String specialTalent;

    public Dragon(String name, int speedOfTurn, int powerOfAttack, String monster, String specialTalent) {
        super(name, speedOfTurn, powerOfAttack);
        this.monster = monster;
        this.specialTalent = specialTalent;
    }

    @Override
    public void hasMonster() {
        System.out.println(getName() + " is using " + monster);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Name of monster: " + monster);
        System.out.println("Special Talent: " + specialTalent);
    }
}

class BeybladeFabrica {

    public Beyblade generateBeyblade(String beybaldeType) {
        if(beybaldeType.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Blue Dragon", "Speaking with monster");
        }
        else if (beybaldeType.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "Red Phoenix");
        }
        else if (beybaldeType.equals("Drayga")) {
            return new Dranza("Rei", 800, 250, "White Tiger");
        }
        else if (beybaldeType.equals("Draciel")) {
            return new Draciel("Max", 400, 1000, "Black Turtle");
        }
        else {
            return null;
        }
    }
}