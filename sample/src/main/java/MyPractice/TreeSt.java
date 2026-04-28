package MyPractice;

import java.util.TreeSet;

public class TreeSt {
    public static void main(String[] args){
        TreeSet<String> a = new TreeSet<>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("E");

        System.out.println("Tree set is : " + a);
        String check = "B";

        System.out.println("Contains : " + check + " " +a.contains(check));

        System.out.println("First Value : " + a.first());

        System.out.println("Final Value : " + a.last());

        String value = "B";
        System.out.println("Higher : " + a.higher(value));
        System.out.println("Lower : " + a.lower(value));
    }
}
