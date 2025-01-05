import java.util.*;
public class TwoDArrays {
    public static void main (String[] args) {

        
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Pufs");


        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tomato");
        produceList.add("onions");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        groceryList.add(produceList);

        System.out.println(groceryList.get(0).get(0));



        


    }
}