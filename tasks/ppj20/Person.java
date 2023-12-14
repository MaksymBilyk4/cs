package ppj20;

public class Person {

    private String name;
    private int birthdayYear;

    public Person(String name, int birthdayYear) {
        this.name = name;
        this.birthdayYear = birthdayYear;
    }

    public Person(String name) {
        this.name = name;
        this.birthdayYear = 1990;
    }


    public String getPersonName() {
        return this.name;
    }

    public int getPersonBirthdayYear() {
        return this.birthdayYear;
    }

    public static Person getOlderPerson(Person p1, Person p2) {
        return p1.getPersonBirthdayYear() < p2.getPersonBirthdayYear() ? p1 : p2;
    }

    public static Person getTheOldestPerson(Person[] persons) {
        Person oldest = persons[0];

        for (int i = 0; i < persons.length - 1; i++) {
            oldest = getOlderPerson(persons[i], persons[i + 1]);
        }

        return oldest;
    }

    public String showPersonData () {
        return "person -> { name: " + this.getPersonName() + ", year: " + this.getPersonBirthdayYear() + " }";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdayYear=" + birthdayYear +
                '}';
    }
}
