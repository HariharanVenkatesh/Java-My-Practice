package MyPractice;

import java.io.IOException;

public class ExeptionHandling {
    public static void main(String[] args) throws IOException {
        try {
            int[] myNum = {1, 2, 3};
            if (myNum.length < 4) {
                throw new ArrayIndexOutOfBoundsException("Array index out of bound");
            }
        }catch (Exception b){
            System.out.println(b.getMessage());
        }
    }
}
