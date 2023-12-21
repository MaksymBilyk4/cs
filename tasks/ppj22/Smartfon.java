package ppj22;

import java.util.Arrays;

public class Smartfon extends Komorka {

    private Person[] friends;


    public Smartfon(String color) {
        super(color);
        this.friends = new Person[0];
    }

    @Override
    public void connectionHistory() {
        if (this.friends.length == 0) {
            System.out.println("No connection history! (Smartfon.java)");
            return;
        }

        System.out.println("Connection history: (Smartfon.java)");
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == null) break;
            System.out.println(
                    (i + 1) + ". " +
                            this.friends[i].getFirstName() + ", " +
                            this.friends[i].getLastName() + ", " +
                            this.friends[i].getNumber()
            );
        }
    }

    @Override
    public void call(String number) {
        super.call(number);
    }

    public void addToFriends(String name, String surname, String number) {
        call(number);

        Person person = new Person(name, surname, number);
        Person[] clone = new Person[this.friends.length + 1];
        clone[0] = person;

        if (clone.length == 1) {
            this.friends = clone;
            return;
        }

        for (int i = 1; i < clone.length; i++) {
            clone[i] = this.friends[i - 1];
        }

        this.friends = clone;
    }

    public void setFriends(Person[] friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Smartfon{" +
                "friends=" + Arrays.toString(friends) +
                '}';
    }
}
