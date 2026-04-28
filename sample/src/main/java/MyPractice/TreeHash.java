package MyPractice;
import java.util.*;

public class TreeHash {
    static void Constructor(){
        TreeMap<Integer, String> tmp = new TreeMap<>();

        tmp.put(10, "Apple");
        tmp.put(11, "Mango");
        tmp.put(12, "Orange");
        tmp.put(13, "Guava");

        System.out.println("TreeMap" + tmp);
    }
    public static void main(String[] args){
        System.out.println(
                "TreeMap using TreeMap() constructor"
        );
        Constructor();
    }
}
