package MyPractice;

//Iterating in Linked List

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args){
        LinkedList<String> a = new LinkedList<String>();
        a.add("Hariharan");
        a.add("Ashwin");
        a.add("Caleb");
        a.add("Abi");
        a.add("Pradeep");
        a.add("Dravid");
        a.add(0,"Sarvesh");
        System.out.println(a);

        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i) +" ");
        }
        System.out.println();

        for(String b : a)
            System.out.println(b);
    }
}
