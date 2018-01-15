package facade;

public class Client {
    public static void main(String[] args) {
        MailFacade mailFacade = new MailFacade();
        mailFacade.sendMail("hello world","John");
    }
}
