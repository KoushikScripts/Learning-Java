public class Switches {
    public static void main(String[] args) {
        //switch = statement that allowes a variable to be tested for eqality aganist a list of values
        
        String day = "sytem";

        switch (day) {
            case "Sunday":System.out.println("it is sunday");
            break;
            case "Monday":System.out.println("it is Monday");
            break;
            case "Tuesday":System.out.println("it is Tuesday");
            break;
            case "Wednesday":System.out.println("it is Wednesday");
            break;
            case "Thuresday":System.out.println("it is Thuresday");
            break;
            case "Friday":System.out.println("it is Friday");
            break;
            case "Saturday":System.out.println("it is Saturday");
            break;
            default:System.out.println("Day dosen't match");//applies when there is no match found in case
        }
    }
}