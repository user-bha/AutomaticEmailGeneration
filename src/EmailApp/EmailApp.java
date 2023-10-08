package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
       Email em1 = new Email("Bhavya" , "Bodimalla");
       em1.setAlternateEmail("bhavya2781@gmail.com");
       // System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}
