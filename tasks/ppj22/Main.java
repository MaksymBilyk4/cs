package ppj22;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Telefon telefon = new Telefon("Red");
        telefon.connectionHistory();
        System.out.println();

        Komorka komorka = new Komorka("White");
        komorka.call("123-456");
        komorka.call("24324-24");
        komorka.call("3432");
        komorka.call("4324324324");
        komorka.call("+4932");
        komorka.call("432493289");

        komorka.connectionHistory();

        Smartfon smartfon = new Smartfon("Black");
        System.out.println();
        smartfon.call("0999752899");
        smartfon.connectionHistory();

        smartfon.addToFriends("Maksym", "Bilyk", "0999752899");
        smartfon.addToFriends("Ktos 1", "Suname 1", "111111111d");
        smartfon.addToFriends("Ktos 2", "Suname 2", "22222222f");
        smartfon.addToFriends("Ktos 3", "Suname 3", "3333333333");
        smartfon.addToFriends("Ktos 4", "Suname 4", "444444444444");
        smartfon.addToFriends("Ktos 5", "Suname 5", "5555555555");
        smartfon.addToFriends("Ktos 6", "Suname 6", "66666666666");
        smartfon.addToFriends("Ktos 7", "Suname 7", "7777777777");
        smartfon.addToFriends("Ktos 8", "Suname 8", "88888888888");
        smartfon.addToFriends("Ktos 9", "Suname 9", "9999999999");
        smartfon.addToFriends("Ktos 10", "Suname 10", "10101010101001");
        smartfon.connectionHistory();


        System.out.println("--------------------------------");
        Telefon[] telefons = {
                telefon,
                komorka,
                smartfon
        };

        System.out.println(Arrays.toString(telefons));


    }

}
