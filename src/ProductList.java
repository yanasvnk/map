//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Set;

public class ProductList {
    private Set<Product> products;

    public ProductList(Set<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        if (this.products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть!");
        } else {
            this.products.add(product);
        }
    }

    public void remove(Product product) {
        this.products.remove(product);
    }

    public String toString() {
        return this.products.toString();
    }

}