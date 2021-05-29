package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("is Empty = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("List is Empty, keep coding java");
        }else{
            System.out.println("List is not empty, keep coding java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("jacket");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("phone");
        shoppingList.add("java Book");
        shoppingList.add("scooter");

        if(shoppingList.isEmpty()){
            System.out.println("List is Empty, keep coding java");
        }else{
            System.out.println("List is not Empty, code java then go to mall");

        }
        int count = shoppingList.size();
        System.out.println("Items to Buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("shoes is in the list");

        }else{
            System.out.println("shoes is not in the list");
        }
        System.out.println("Buying shoes ... $80");

        shoppingList.remove("shoes");
        System.out.println("list = " + shoppingList);

        System.out.println("shopping done, get back to coding");
        shoppingList.clear(); // clear the list, remove all the elements from the list
        System.out.println(shoppingList);

    }
}
