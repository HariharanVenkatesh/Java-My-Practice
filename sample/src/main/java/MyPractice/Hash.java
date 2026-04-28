package MyPractice;
//Collection ,Hashmap,Linked HashMap,Iteration

//import java.util.HashMap;
import java.util.*;

public class Hash {
    public static void main(String[] args){
//        HashMap<String, Integer> name = new HashMap<>();
        LinkedHashMap<Integer, String> name = new LinkedHashMap<Integer, String>();

//        name.put("Hariharan", 23);
//        name.put("Ashwin", 11);
//        name.put("Caleb", 18);

         name.put(23, "Hariharan");
         name.put(11, "Ashwin");
         name.put(18, "Caleb");

//        System.out.println("Map Elements: " + name);

//        for(Map.Entry<String, Integer> entry : name.entrySet()){
//            System.out.println(entry.getKey() + "->" + entry.getValue());
            for (Map.Entry<Integer, String>mapEl : name.entrySet()){
                Integer key = mapEl.getKey();
                String value = mapEl.getValue();

                System.out.println(key + ":" +value );


        }

    }
}
