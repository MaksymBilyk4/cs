package ppj20;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        donkey.makeDonkeyFly();

        System.out.println();

        Word word = new Word();
        System.out.println("Word length ---> " + word.length());
        word.addChar('m');
        word.addChar('a');
        word.addChar('k');
        word.addChar('s');
        word.addChar('y');
        word.addChar('m');
        word.addChar('s');
        word.addChar('3');
        word.addChar('8');
        word.addChar('0');
        word.addChar('6');
        word.addChar('7');
        System.out.println("Word length ---> " + word.length());
        word.show();

        System.out.println();
        Person p1 = new Person("Maksym", 2006);
        Person p2 = new Person("Artem", 2005);
        Person p3 = new Person("Ktos");
        Person p4 = new Person("ABDC", 2000);
        System.out.println("Older person -> " + Person.getOlderPerson(p1, p2).showPersonData());
        Person[] persons = {p1, p2, p3, p4};
        System.out.println();
        System.out.println("persons array -> " + Arrays.toString(persons));
        System.out.println();
        System.out.println("The oldest person -> " + Person.getTheOldestPerson(persons));
    }

}
