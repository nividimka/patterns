package iterator;

public class Client {
    public static void main(String[] args) {
        HumanCollection humans = initHumans();
        HumanIterator baseIterator = humans.iterator(GenderEnum.ALL);
        while (baseIterator.next()) {
            Human h = baseIterator.getCurrent();
            System.out.println(h.toString());
        }
        System.out.println("******");
        HumanIterator womansIterator = humans.iterator(GenderEnum.WOMAN);
        while (womansIterator.next()) {
            Human h = womansIterator.getCurrent();
            System.out.println(h.toString());
        }

    }


    private static HumanCollection initHumans() {
        HumanCollection humanCollection = new HumanCollectionImpl();
        humanCollection.addHuman(new Human(GenderEnum.MAN,"Alex"));
        humanCollection.addHuman(new Human(GenderEnum.WOMAN,"Zhenya"));
        humanCollection.addHuman(new Human(GenderEnum.MAN,"Ivan"));
        humanCollection.addHuman(new Human(GenderEnum.WOMAN,"Marina"));
        humanCollection.addHuman(new Human(GenderEnum.MAN,"Igor"));
        humanCollection.addHuman(new Human(GenderEnum.MAN,"Andrew"));
        humanCollection.addHuman(new Human(GenderEnum.MAN,"Dima"));
        return humanCollection;
    }
}
