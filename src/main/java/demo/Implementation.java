package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anastasiya on 12.02.2017.
 */
public class Implementation {
    private static String string1 = "This is message 2341. Another will be at 23 october 2018.";
    private static String string2 = "[text] TEXT 23-23456-2334 text “Text”";
    private static String string3 = "Please, enter @ or & to continue step 67";

    private static String pattern1 = "23 october 2018.";
    private static String pattern2 = "\\[text]|2334";
    private static String pattern21 = "((T|t)(E|e)(X|x)(T|t))";
    private static String pattern3 = "@|&";


    static void implementation() {
        printStart();
        string1 = replacePattern(string1, pattern1);
        findPattern(string2, pattern21);
        string2 = replacePattern(string2, pattern2);
        string3 = replacePattern(string3, pattern3);

        printEnd();
    }

    private static void printStart() {
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3 + "\n");
    }

    private static String replacePattern(String string, String pattern) {
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(string);

        return m.replaceAll("-");
    }

    private static void findPattern(String string, String pattern) {
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(string);
        int count = 0;

        while (m.find()) {
            count++;
        }
        System.out.println("Количество вхождений 'text' = " + count + "\n");
    }

    private static void printEnd() {
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }
}
