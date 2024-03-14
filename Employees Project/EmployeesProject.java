//  ZEYNEP TANRIVERMİŞ
//  14.03.2024

import java.util.Scanner;

public class EmployeesProject {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME EMPLOYEE PROGRAM");
        String menu = "Menu" + "\n" +
        "1. Developer Operations" + "\n" +
        "2. Administrator Operations" + "\n" + 
        "Q. Quit";

        while(true){
            System.out.println(menu);
            String choice = scan.nextLine();

            if(choice.equalsIgnoreCase("Q")){
                System.out.println("Exiting...");
                break;
            }
            else{
                if(choice.equalsIgnoreCase("1")){
                    Developer developer = new Developer("Zeynep", "Tanrıvermiş", 123, "Java, Pyhton");
                    String developerMenu = "1. Format" + "\n" +
                    "2. Show Information" + "\n" + 
                    "Q. Quit";
                    while(true){
                        System.out.println(developerMenu);
                        String choiceDeveloper = scan.nextLine();
                        scan.nextLine();
                        if(choiceDeveloper.equalsIgnoreCase("Q")){
                            System.out.println("Exiting...");
                            break;
                        }
                        else{
                            if(choiceDeveloper.equalsIgnoreCase("1")){
                                System.out.println("Enter the name of Operating System: ");
                                String operatingSystem = scan.nextLine();
                                developer.format(operatingSystem);
                            }
                            else if(choice.equalsIgnoreCase("2")){
                                developer.showDatas();
                            }
                            else{
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                }
                else if(choice.equalsIgnoreCase("2")){
                    Administrator administrator = new Administrator("Zeynep", "Zeynep", 789, 200);
                    String administratorMenu = "1. Salary Raise" + "\n" +
                    "2. Show Information" + "\n" + 
                    "Q. Quit";
                    while(true){
                        String choiceAdministrator = scan.nextLine();
                        if(choiceAdministrator.equalsIgnoreCase("Q")){
                            System.out.println("Exiting...");
                            break;
                        }
                        else{
                            if(choiceAdministrator.equalsIgnoreCase("1")){
                                System.out.println("Enter the amount of raise: ");
                                int raise = scan.nextInt();
                                administrator.salaryRise(raise);
                            }
                            else if(choiceAdministrator.equalsIgnoreCase("2")){
                                administrator.showDatas();
                            }
                            else{
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                }
                else{
                    throw new IllegalArgumentException();
                }
            }
        }
        
    }
}

class Employees{
    //  data fields
    private String name;
    private String surName;
    private int id;

    //  constuctor
    public Employees(String name, String surName, int id){
        this.name = name;
        this.surName = surName;
        this.id = id;
    }

    //  getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void showDatas(){
        System.out.println("Employee...");
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurName());
        System.out.println("Id: " + getId());
    }
}

class Developer extends Employees{
    //  data fields
    private String languages;

    //  constructor
    public Developer(String name, String surName, int id, String languages) {
        super(name, surName, id);
        this.languages = languages;
    }

    //  getter and setter methods 
    public String getLanguages() {
        return languages;
    }
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void format(String operatingSystem){
        System.out.println(getName() + " is downloading " + operatingSystem);
    }

    public void showDatas(){
        super.showDatas();
        System.out.println("Languages that the developer knows: " + languages);
    }
}

class Administrator extends Employees{
    //  data fields
    private int numberOfWorker;

    //  constructor
    public Administrator(String name, String surName, int id, int numberOfPeople) {
        super(name, surName, id);
        this.numberOfWorker = numberOfWorker;
    }

    public void showDatas(){
        super.showDatas();
        System.out.println("The number of people that the administrator responsible for " + numberOfWorker);
    }

    public void salaryRise(int raise){
        System.out.println(getName() + "gives employees a raise of " + raise);
    }
}
