import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Recipe {

    private  final Map<Product, Integer> products = new HashMap<>();
    private final String name;

    public Recipe(String name) {this.name = ValidateUtils.validateString(name, "Default");}

    public double getTotalCostAllProducts(){
        double sum = 0.0;
        for (Map.Entry<Product, Integer> product: products.entrySet()) {
    sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }
  public void checkProduct(String name) {
        boolean isBought = false;
        for (Map.Entry<Product,Integer> product: products.entrySet()) {
            if (product.getKey().getName().equals(name)) {
                System.out.println(name + " куплен");
                isBought=true;
                break;
            }
        }
        if (!isBought) {
            System.out.println(name + " не куплен");
        }
  }
  public void addProductList(Product product) {
        if (product==null) {
            return;
        }
        if (this.products.containsKey(product)) {
            Integer productCount = this.products.get(product);
            this.products.put(product, ++productCount);
        } else {
            this.products.put(product, 1);
        }
        }
        public String getName() {return name;}

}
