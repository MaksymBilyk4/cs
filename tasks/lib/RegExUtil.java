package lib;

import lib.exception.IncorrectAuthorNameException;
import lib.exception.IncorrectBookNameException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtil {

    public static void validateBookName(String bookName) throws IncorrectBookNameException {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}(\\s[A-Za-z]+)*$");
        Matcher matcher = pattern.matcher(bookName);

        if (matcher.matches()) return;
        else throw new IncorrectBookNameException("Incorrect book pattern.\nBook name should start with big letter and contain minimum 3 symbols.\nBook name can't contain numbers\nExample: 'Oak'");
    }

    public static void validateAuthorName(String authorName) throws IncorrectAuthorNameException {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$");
        Matcher matcher = pattern.matcher(authorName);

        if (matcher.matches()) return;
        else throw new  IncorrectAuthorNameException("Incorrect author name patter.\n Author name should contain minimum name and surname.\nExample: Maksym Bilyk");
    }

}
