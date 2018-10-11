import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int count=0;
        System.out.print("What is your name?");
        String name=input.nextLine();
        System.out.print("Welcome"+name+""+"to my game");
        System.out.print("Which game type do you want to play?");
        System.out.print("Type in Type 1 if you want to guess numbers from 1-10");
        System.out.print("Type in Type 2 if you want to guess numbers from 1-100");

        String difft=input.nextLine();
        if(difft=="Type 1"||difft=="type 1")
        {
            int num=(int)(Math.random()*11);
            int guess=input.nextInt();
            while(num!=guess)
            {
                System.out.print("Guess again"+name+":");
                count+=1;
                guess=input.nextInt();
            }
            System.out.print("You took"+count+"tries to guess the number"+name);
        } else if(difft=="Type 2"||difft=="type 2")
        {
            int num=(int)(Math.random()*101);
            int guess=input.nextInt();
            while(num!=guess)
            {
                System.out.print("Guess agian"+name+":");
                count+=1;
                guess=input.nextInt();
            }
            System.out.print("You took"+count+"tries to guess the number"+","+name);
        }
    }
}
