public class Arrays {
    public static void main (String[] args) {


        String[] cars = {"tata","toyota", "VW" };
        
        cars[0]="Ford";

        // System.out.println(cars[2]);

        // another way of wrting or assigning arrays

        String[] drinks = new String[4]; // first declare the elements that we would like to use

        // now assigne/declare elements

        drinks[0] = "Coke";
        drinks[1] = "Pepsi";
        drinks[2] = "Fizz";
        drinks[3] = "Fruti";
        //drinks[4] = "apple juice";

       // System.out.println(drinks[3]);


        // using for loops
        for (int i = 0; i<drinks.length; i++){
            System.out.println(drinks[i]);
        }
    }
}
