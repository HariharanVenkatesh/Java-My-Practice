package MyPractice;

import java.io.*;
import java.util.*;
import java.util.Iterator;

public class LinkedHSet {
    public static void main(String[] args){
        LinkedHashSet<String> lst = new LinkedHashSet<>();
        lst.add("Srikanth");
        lst.add("Arun Mozhi");
        lst.add("Kishore");
        lst.add("Praveen");
        lst.add("Harish Krishnan");
        lst.add("Vignesh");
        lst.add("Rajesh");

        lst.remove("Srikanth");

        Iterator a = lst.iterator();

        while(a.hasNext())
            System.out.print(a.next() + ",");
        System.out.println();

        for(String b : lst)
            System.out.print(b + ",");
        System.out.println();

        lst.forEach(System.out::println);
    }
}
