package MyPractice;
import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args){
        ArrayList<String> Foods = new ArrayList<String>();
        Foods.add("Dosa");
        Foods.add("Idly");
        Foods.add("Parotta");
        Foods.add("Chappathi");
        Foods.add("Chicken Curry");

        System.out.println("List Of Items :" + Foods);

        Foods.add(0,"Masala Dosa");
        System.out.println("After Adding a New Item in the index of 0 :" + Foods);

        Foods.remove(1);
        System.out.println("After Removing a existing item in the index 1 :" + Foods);

        Foods.set(4,"Chicken Gravy");
        System.out.println("After Setting a New Item in the index of 4 :" + Foods);

    }
}
