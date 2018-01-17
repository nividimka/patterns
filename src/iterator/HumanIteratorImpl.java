package iterator;

import java.util.List;

public class HumanIteratorImpl implements HumanIterator {
    GenderEnum genderEnum;
    List<Human> humans;
    private int position;

    public HumanIteratorImpl(GenderEnum genderEnum, List<Human> humans) {
        this.genderEnum = genderEnum;
        this.humans = humans;
    }

    @Override
    public boolean next() {
        while (position < humans.size()) {
            Human human = humans.get(position);
            if (human.getGenderEnum().equals(genderEnum) || genderEnum.equals(GenderEnum.ALL)) {
                return true;
            } else
                position++;
        }
        return false;
    }

    @Override
    public Human getCurrent() {
        Human human = humans.get(position);
        position++;
        return human;
    }

    @Override
    public Human first() {
        position = 0;
        Human human = humans.get(0);
        if (human.getGenderEnum().equals(genderEnum) || genderEnum.equals(GenderEnum.ALL)) {
            return getCurrent();
        } else {
            next();
            return getCurrent();
        }
    }
}
