package egz1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String mail = "username@gmail.com";

        Pattern pattern = Pattern.compile("[A-Za-z]+@(gmail)\\.(com)");
        Matcher matcher = pattern.matcher(mail);

        System.out.println(matcher.matches());

    }

}
