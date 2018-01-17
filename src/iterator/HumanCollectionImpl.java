package iterator;

import java.util.ArrayList;
import java.util.List;

public class HumanCollectionImpl implements HumanCollection {
    List<Human> humans;

    public HumanCollectionImpl(List<Human> humans) {
        this.humans = humans;
    }

    public HumanCollectionImpl() {
        this.humans = new ArrayList<>();
    }

    @Override
    public void addHuman(Human h) {
        humans.add(h);
    }

    @Override
    public void removeHuman(Human h) {
        humans.remove(h);
    }

    @Override
    public HumanIterator iterator(GenderEnum type) {
        return new HumanIteratorImpl(type,humans);
    }
}
