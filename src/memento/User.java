package memento;

public class User {
    public String name;
    public String surname;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public PersonalData saveData(){
        return new PersonalData(name, surname, age);
    }
    public void restoreData(PersonalData personalData){
        this.name = personalData.getName();
        this.surname = personalData.getSurname();
        this.age = personalData.getAge();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
