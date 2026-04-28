package MyPractice;
import java.util.HashSet;
import java.util.Iterator;

public class set {
    public static void main(String[] args){
        HashSet<String> a = new HashSet<>();

        a.add("Hariharan");
        a.add("Hariharan");
        a.add("Aswin");
        a.add("Caleb");
        a.add("Abi");
        a.add("Pradeep");
        a.add("Shajith");
        a.add("Sarvesh");

//        System.out.println("Result Using Iterator : ");
//        Iterator<String> iterator = a.iterator();
//
//        while(iterator.hasNext())
//            System.out.print(iterator.next() + ",");
//        System.out.println();
//
//        System.out.print("Result Using enhanced for loop : ");
//        for(String element: a)
//            System.out.print(element + ",");

//        Removing Elements in HashSet
        System.out.println("HashSet" + a);
        a.remove("Abi");
        System.out.println("HashSet after removing element : " + a);


        System.out.println("Abi exists in Set : " + a.remove("Abi"));


    }

}
