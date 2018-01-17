package iterator;

public class Human {
    GenderEnum genderEnum;
    String name;

    public Human(GenderEnum genderEnum, String name) {
        this.genderEnum = genderEnum;
        this.name = name;
    }

    public GenderEnum getGenderEnum() {
        return genderEnum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "genderEnum=" + genderEnum +
                ", name='" + name + '\'' +
                '}';
    }
}
