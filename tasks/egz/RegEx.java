package egz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
		/*
		 	//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/regex/Pattern.html

					[abc]
					[a|b|c]

					[0-9] 			\d
					[a-zA-Z_0-9]	\w
					\p{L}
					\s
					.	\.
					[^abc]
					\D
					\W

					a{2}
					b{2,}
					c{2,3}
					a*
					a+
					a?
					(ab)*

					(...)|(...)|(...)

					((...)...(...)...)...(...)	m.group(...)
		*/

        String input = "aa999ca";    //"aa99baa999cdeaa999cf";
        String regex = "a{2}9{3}c";

//        Pattern pattern = Pattern.compile(regex);
//        Mathcer mathcer = Pattern.matches(ex)

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean check = matcher.matches();
        System.out.println(check);

        // lub
        //System.out.println(Pattern.matches(regex, input));

        //matcher.reset();

        //mat.find();
        //mat.group();

        while (matcher.find()) {
            System.out.println(matcher.group());
            //System.out.println(mat.start());
            //System.out.println(mat.end());
        }
    }
}
