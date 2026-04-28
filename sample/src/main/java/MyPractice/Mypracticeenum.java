package MyPractice;

enum Mypractice{
    TESTED,
    SUCCESS,
    FAILED,
}
public class Mypracticeenum{

    public static void main(String[] args){
        Mypractice a = Mypractice.SUCCESS;

        switch (a){
            case Mypractice.TESTED:
                System.out.println("Your Code is Tested");
                break;
            case SUCCESS:
                System.out.println("Code is Executed Successfully");
                break;
            case FAILED:
                System.out.println("Your code is Failed!!!");
        }
    }
}
