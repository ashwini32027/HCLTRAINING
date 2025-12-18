package Assignment1;

import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = " HelloWorld ";
        String str2 = "Hello";

        // length()
        System.out.println("Length of str1: " + str1.length());

        // isEmpty()
        System.out.println("Is str1 empty? " + str1.isEmpty());

        // charAt()
        System.out.println("Character at index 1: " + str1.charAt(1));

        // toString()
        System.out.println("toString of str1: " + str1.toString());

        // equals()
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // compareTo()
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // contains()
        System.out.println("str1 contains 'World'? " + str1.contains("World"));

        // indexOf()
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));

        // lastIndexOf()
        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));

        // startsWith()
        System.out.println("str1 starts with 'He'? " + str1.trim().startsWith("He"));

        // endsWith()
        System.out.println("str1 ends with 'ld'? " + str1.trim().endsWith("ld"));

        // matches() (regex)
        System.out.println("str2 matches 'Hello'? " + str2.matches("Hello"));

        // substring()
        System.out.println("Substring of str1 (1,5): " + str1.substring(1, 5));

        // toLowerCase()
        System.out.println("Lowercase str1: " + str1.toLowerCase());

        // trim()
        System.out.println("Trimmed str1: '" + str1.trim() + "'");

        // replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // split()
        String[] parts = str1.trim().split("o");
        System.out.println("Split str1 by 'o': " + Arrays.toString(parts));

        // join()
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Joined string: " + joined);

        // valueOf()
        int num = 100;
        String strNum = String.valueOf(num);
        System.out.println("ValueOf int 100: " + strNum);

        // Demonstrating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer after append: " + sb);

        // Demonstrating StringBuilder
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" Java");
        System.out.println("StringBuilder after append: " + sbd);
    }
}
 
