
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quantity) {
        this.name = ValidateUtils.validateString(name, "Default");
        this.price = ValidateUtils.validateDouble(price, 0.0);
        this.quantity = ValidateUtils.validateInteger(quantity, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidateUtils.validateString(name, "Default");}


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       this.price = ValidateUtils.validateDouble(price, 0.0);
        }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = ValidateUtils.validateInteger(quantity, 0);
        }


    @Override
    public String toString() {
        String name = this.getName();
        return "Продукт - " + this.getName() + ", цена - " + this.getPrice() + ", количество - " + this.getQuantity() + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Product product = (Product)o;
            return Objects.equals(this.name, product.name);
        } else {
            return false;
        }
    }

    }


