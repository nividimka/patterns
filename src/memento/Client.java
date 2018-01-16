package memento;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        DataProvider dataProvider = new DataProvider();
        user.age = 16;
        user.surname = "Orekhov";
        user.name = "Alex";
        System.out.println(user.toString());
        System.out.println("EDIT");
        dataProvider.setPersonalData(user.saveData());
        user.name = "NonAlex";
        System.out.println(user.toString());
        System.out.println("CANCEL");
        user.restoreData(dataProvider.getPersonalData());
        System.out.println(user.toString());
    }
}
