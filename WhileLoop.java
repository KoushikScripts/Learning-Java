import java.util.Scanner;

public class WhileLoop {
    public static void main (String[] args){
        // while loop = excutes a block of code as long as the it's conditoins met
        Scanner scanner = new Scanner(System.in);

        String name = "";
        
        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();            
        }
        System.out.println("Welcome "+name);
    }
    
}
