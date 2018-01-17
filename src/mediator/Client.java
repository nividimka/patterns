package mediator;

public class Client {

    public static void main(String[] args) {
        Chat chat = new Chat();

        Manager manager = new Manager(chat);
        Programmer programmer = new Programmer(chat);

        chat.setManager(manager);
        chat.setProgrammer(programmer);

        manager.send("How are you?");
        programmer.send("I haven't done my work yet!");
    }
}