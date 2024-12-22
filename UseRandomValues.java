import java.util.Random;

public class UseRandomValues {
    public static void main(String[] args){
        // Create a new Random object
        // using a random values for some tasks like assigning UUID's
        Random random = new Random();
        //these are not true random number they are psudorandom number which are close enough

        // int x = random.nextInt(101);
        // double x = random.nextDouble(0.9);
        boolean x = random.nextBoolean();
        System.out.println(x);
    }
}