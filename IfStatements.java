import java.util.Scanner;
public class IfStatements {
    public static void main(String[] args) {

        // if statements are used when you want to exicute something if a certain condition is met
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        
        if (age>=75) {
            System.out.println("You are a senior");
        } 
        else if (age >= 18) {
            System.out.println("You are an adult");
        }
        else if (age <=7){
            System.out.println("You are a kid");
        }
        else {
            System.out.println("You are a minor");
    }
}
}