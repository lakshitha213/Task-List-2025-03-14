
import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class Fruit extends Product {
    private String color;

    public Fruit(String name, double price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Color: " + color);
    }
}

class Vegetable extends Product {
    private String type;

    public Vegetable(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Type: " + type);
    }
}

class Grocery extends Product {
    private String brand;

    public Grocery(String name, double price, int quantity, String brand) {
        super(name, price, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Brand: " + brand);
    }
}

class RetailStore {
    private ArrayList<Product> products;

    public RetailStore() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void editProduct(int index, String name, double price, int quantity) {
        if (index >= 0 && index < products.size()) {
            Product product = products.get(index);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
        }
    }

    public void deleteProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available in the store.");
        } else {
            for (Product product : products) {
                product.displayProductDetails();
                System.out.println("------------------------");
            }
        }
    }
}

public class store {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        Product apple = new Fruit("Apple", 1.5, 100, "Red");
        Product carrot = new Vegetable("Carrot", 0.8, 50, "Root");
        Product rice = new Grocery("Rice", 2.0, 200, "BrandX");

        store.addProduct(apple);
        store.addProduct(carrot);
        store.addProduct(rice);

        System.out.println("Available products in the store:");
        store.displayProducts();

        store.editProduct(0, "Green Apple", 1.8, 120);

        System.out.println("\nAfter editing the first product:");
        store.displayProducts();

        store.deleteProduct(1);

        System.out.println("\nAfter deleting the second product:");
        store.displayProducts();
    }
}
