public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");

        em1.setAlternateEmail("js@gmail.com");
        em1.setMailboxCapacity(100);
        em1.changePassword("K*7e4u8");
        System.out.println("Alternate email: " + em1.getAlternateEmail() + "\nNew password: " + em1.getPassword());
        System.out.println(em1.showInfo());
    }
}
