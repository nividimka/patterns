package iterator;

public interface HumanCollection {
    public void addHuman(Human h);

    public void removeHuman(Human h);

    public HumanIterator iterator(GenderEnum type);
}
