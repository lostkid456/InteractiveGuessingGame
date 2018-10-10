import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("What is your name?");
        String name=input.nextLine();
        System.out.print("Welcome"+name+""+"to my game");
        System.out.print("Which game type do you want to play?");
        System.out.print("Type in Type 1 if you want to guess numbers from 1-10");
        System.out.print("Type in Type 2 if you want to guess numbers from 1-100");
        String difft=input.nextLine();
        if(difft=="Type 2")
        {
            
        }
    }
}
