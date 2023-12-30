package practice;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String s = "     vipul patel is a very good boy";
        String a = "            ";
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(s.trim());
        System.out.println(s.replaceAll("vipul", "viral"));
        System.out.println(s.replace("good", "bad"));
        System.out.println(s.codePointAt(11));
        System.out.println(s.concat("hii"));
        System.out.println(s.indent(10));
        System.out.println(a.isBlank()); // true
        System.out.println(a.isEmpty()); // false
        System.out.println(s.matches("     vipul patel is a very good boy"));
        System.out.println(s.length());

        System.out.println(s.offsetByCodePoints(1, 34));

        System.out.println(s.regionMatches(false, 5, "vipul", 0, 5));
        System.out.println(s.intern());

    }
}