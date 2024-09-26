import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Add Elements to HashMap: Create a HashMap, add 5 key-value pairs, and print them.
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"product1");
        map.put(2,"product2");
        map.put(3,"product3");
        map.put(4,"product4");
        map.put(5,"product5");
        map.forEach((key,value) -> System.out.println("number of product : "+key+" product name : "+value));









    }
}