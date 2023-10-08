package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 8;
    private  String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "SVcompany.com";
    //constructor to receive first name and lastname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
       // System.out.println(this.firstName + " " + this.lastName);
        //call a method asking for the department and return it
        this.department = setDepartment();
       // System.out.println(department);
        //call the method that generates random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is" + password);
        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
    }
    //ask for department
    private String setDepartment(){
        System.out.println(" New worker: " + firstName + " Enter the department code\n DEPARTMENT CODE:\n0 for none\n1 for sales\n2 for Development\n3 for Accounting\nEnter the department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice==1) return "Sales";
        else if (depChoice == 2) return "Development";
        else if (depChoice == 3) return "Accounting";
        else return "";
    }
    //generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz0123456789";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    //set mail box capacity
     public void setSetMailboxCapacity(int mailboxCapacity) {
            this.mailboxCapacity = mailboxCapacity;
      }

    public void setChangePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    //set an alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }
//change the password
    public void setPassword(String password) {
        this.password = password;
    }
    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailBox Capacity: " + mailboxCapacity + "mb" +
                "\nAlternate Email: " + alternateEmail ;
    }

}