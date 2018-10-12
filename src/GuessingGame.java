import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int count=0;
        System.out.print("What is your name?");
        String name=input.nextLine();
        System.out.print("Welcome"+""+name+""+"to my game");
        System.out.println("Which game type do you want to play?");
        System.out.println("Type in 1 if you want to guess numbers from 1-10");
        System.out.println("Type in 2 if you want to guess numbers from 1-100");
        System.out.println("Type in 3 if you want to guess numbers from 1-1000");
        System.out.println("Type in 4 if you want to guess number from 1-10000");
        int difft=input.nextInt();
        if(difft==1)
        {
            int num=(int)(Math.random()*11);
            int guess=input.nextInt();
            while(num!=guess)
            {
                System.out.print("Guess again"+name+":");
                count+=1;
                guess=input.nextInt();
            }
            System.out.print("You took"+count+1+"tries to guess the number"+name);
        } else if(difft==2)
        {
            int num=(int)(Math.random()*101);
            int guess=input.nextInt();
            while(num!=guess)
            {
                System.out.print("Guess agian"+name+":");
                count+=1;
                guess=input.nextInt();
            }
            System.out.print("You took"+count+1+"tries to guess the number"+","+name);
        } else if(difft==3)
        {
            int num=(int)(Math.random()*1001);
            int guess=input.nextInt();
            while(num!=guess)
            {
                System.out.print("Guess again"+name+":");
                count+=1;
                System.out.print("You have already taken"+count+"guesses");
                guess=input.nextInt();
            }
            System.out.print("You took"+(count+1)+"tries to guess the number"+","+name);
        } else if(difft==4)
        {
            int num=(int)(Math.random()*100001);
            int guess=input.nextInt();
            while(num!=guess)
            {
                System.out.print("Guess again"+name+":");
                count+=1;
                guess=input.nextInt();
            }
            count=count+1;
            System.out.print("You took "+""+count+" tries to guess the number"+","+name);
        }
    }
}
