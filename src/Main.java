import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Sveta", "89172346567");
        phoneBook.addContact("Niko", "89172372535");
        phoneBook.addContact("Max", "89172346562");
        phoneBook.addContact("Rick", "89172346539");
        phoneBook.addContact("Leo", "89172346599");
        phoneBook.addContact("Ivan", "89172346576");
        phoneBook.addContact("Goga", "89172346545");
        phoneBook.addContact("Zeus", "89172346543");
        phoneBook.addContact("Kostik", "89172346572");
        phoneBook.addContact("Pavel", "89172346511");
        phoneBook.addContact("Mark", "89172346524");

        System.out.println(phoneBook);

        phoneBook.removeContact("Sveta");

        System.out.println(phoneBook);

        Product product1 = new Product("апельсин", 100, 3);
        Product product2 = new Product("мандарин", 200, 4);
        Product product3 = new Product("дыня", 300, 1);
        Product product4 = new Product("дыня", 500, 5);


        System.out.println(product1);

        System.out.println(product4.equals(product3));
        System.out.println(product1.equals(product4));

        //ProductList productList = new ProductList(new HashSet<>());
        //productList.add(product1);
        //productList.add(product2);
        //productList.add(product3);
        //System.out.println(productList);
        //productList.remove(product1);
        //System.out.println(productList);
        //productList.add(product4);
        //System.out.println(productList);

        //ProductList productList2 = new ProductList(new HashSet<>());
        //productList2.add(product1);
        //productList2.add(product4);
        //System.out.println(productList);

        //ProductList productList3 = new ProductList(new HashSet<>());
        //productList3.add(product2);
        //productList3.add(product3);



        Map<Product, Integer> map = new HashMap<>();
        map.put(product1, 3);
        map.put(product2, 4);
        map.put(product3, 1);
        map.put(product4, 5);

        System.out.println("Размер мапы: " + map.size());

        String valueProduct1 = String.valueOf(map.get(product1));
        System.out.println(map.get(product1));

        System.out.println(map);


        Map<String, Integer> strMap = new HashMap<>();
        strMap.put("строка", 1);
        strMap.put("строка", 1);
        strMap.put("строка 2", 3);
        strMap.put("строка 2", 4);

        System.out.println("Размер мапы: " + strMap.size());
        System.out.println(strMap);
    }
}
