import java.util.Scanner;
public class guess_the_number {
    public static void main(String[] args) {
//        Welcome message
        System.out.println("Welcome to guess the number game!!!");
//        Variable for counting number of attempts
        int attempts = 0;

//        Defining scanner class
        Scanner in = new Scanner(System.in);

//        Setting range for random number generated by computer
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;

//        Asking for player name
        System.out.println("Player enter your name: ");
        String name = in.next();
//        Condition check and player input
        while(true){
           System.out.println("Enter your guess in range 1 - 100");
           int player = in.nextInt();
           if(player == rand){
               System.out.println("You finished the game " + name + " in " + attempts + " attempts!!!");
               break;
           }else if(player > rand){
               System.out.println("You guessed high!!!");
           }else{
               System.out.println("You guessed low!!!");
           }
           ++attempts;
        }
    }
}
