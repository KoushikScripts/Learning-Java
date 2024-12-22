 import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your fav food? ");
        String food = scanner.nextLine();

        System.out.println("hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your fav food is "+food);
    }
    
}
