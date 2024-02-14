package ppj26;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a hexadecimal number: ");
        String hex = scanner.next();

        Pattern pattern = Pattern.compile("^0x[0-9A-Fa-f]{1,8}$|^0$");
        Matcher matcher = pattern.matcher(hex);
        System.out.println(matcher.find());

    }

}
