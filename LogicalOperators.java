import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){

        // && = (AND) Both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) Reverses the boolean value of the condition
        
        int temp = 45;

        if (temp>30) {
            System.out.println("It is hot outside");
        }
        else if (temp>=20 && temp<=30) { //here is the representation of && operation
            System.err.println("It is warm outside");

        }
        else {
            System.out.println("It is cold outside");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("you are playing a game! press q or Q to quit: ");
        String responce = scanner.next();

        if (!responce.equals("Q")|| responce.equals("q")) {
            System.out.println("you quit the game");
        }
        else {System.out.println("Please press q or Q to quit: ");
            
        }
    }

    
}
