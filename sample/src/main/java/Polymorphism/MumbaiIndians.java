package Polymorphism;

 class batsman {
     void Rohit() {
         System.out.println("He is a Opening Batsman");
     }
 }

 class bowler extends batsman {
        @Override
        void Rohit() {
            System.out.println("Rohit is Captain");
        }
    }
    public class MumbaiIndians {
        public static void main(String[] args){
            bowler a = new bowler();
            a.Rohit();
        }

}

