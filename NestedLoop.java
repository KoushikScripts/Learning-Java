import java.util.Scanner;

public class NestedLoop {
    public static void main (String[]args){

        //Nested loop = loop inside of another loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.println("Enter rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter Symbol: ");
        symbol = scanner.next();


        for (int i =1; i<=rows;i++){
            System.out.println();
            for (int j=1;j<=columns;j++){
                System.out.print(symbol);


            }
            System.out.println();

        }

    }
    
}
