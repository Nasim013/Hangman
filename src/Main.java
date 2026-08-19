import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Greetings
       System.out.println("Welcome to Hangman game!");
        System.out.println("Select [N]ew game or [E]xit");
        //Select player
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Input select: ");
            String select = in.nextLine();
            if(select.equals("n") || select.equals("N")){

            } else if (select.equals("e") || select.equals("E")){
                System.out.println("End Hangman game!");
                break;
            } else  {
                System.out.println("Wrong input!");
            }
        }
    }
}
