import java.util.*;

abstract class Product {
    protected int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract String getDetails();
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Electronics extends Product {
    private int warrantyInMonths;

    public Electronics(int id, String name, double price, int warrantyInMonths) {
        super(id, name, price);
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public String getDetails() {
        return name + " (â‚¹" + price + "), Warranty: " + warrantyInMonths + " months";
    }
}

class NonElectronics extends Product {
    public NonElectronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getDetails() {
        return name + " (â‚¹" + price + ")";
    }
}

class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getTotalPrice() { return quantity * product.getPrice(); }
}

class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println(" Your cart is empty.");
            return;
        }
        System.out.println(" Cart Items:");
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " | Quantity: " + item.getQuantity() +
                               " | Total: â‚¹" + item.getTotalPrice());
        }
    }

    public void updateQuantity(int productId, int newQty) {
        for (CartItem item : items) {
            if (item.getProduct().getId() == productId) {
                item.setQuantity(newQty);
                return;
            }
        }
        System.out.println(" No item found in cart with ID: " + productId);
    }

    public void removeItem(int productId) {
        boolean removed = items.removeIf(item -> item.getProduct().getId() == productId);
        if (removed) {
            System.out.println(" Item removed from cart.");
        } else {
            System.out.println(" No item found in cart with ID: " + productId);
        }
    }

    public void checkout() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println(" Total Amount to Pay: â‚¹" + total);
        items.clear();
    }
}

public class ShopSystem {
    static Scanner sc = new Scanner(System.in);
    static Cart cart = new Cart();
    static Map<String, List<Product>> categoryProducts = new HashMap<>();

    public static void main(String[] args) {
        populateProducts();

        while (true) {
            System.out.println("\n===== Online Shopping Cart System =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Update Quantity");
            System.out.println("4. Remove Product");
            System.out.println("5. Checkout & Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: handleAddProduct(); break;
                case 2: cart.viewCart(); break;
                case 3: handleUpdateQuantity(); break;
                case 4: handleRemoveProduct(); break;
                case 5: cart.checkout(); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    static void populateProducts() {
        categoryProducts.put("Electronics", Arrays.asList(
            new Electronics(1001, "Samsung Galaxy S23", 66317, 12),
            new Electronics(1002, "Apple MacBook Air M2", 99417, 12),
            new Electronics(1003, "Sony WH-1000XM5 Headphones", 28967, 24),
            new Electronics(1004, "Dell XPS 13 Laptop", 82917, 12),
            new Electronics(1005, "Amazon Echo Dot", 4067, 12),
            new Electronics(1006, "Logitech MX Master 3", 8217, 36),
            new Electronics(1007, "Fitbit Charge 5", 12367, 12),
            new Electronics(1008, "LG OLED TV", 107917, 24)
        ));

        categoryProducts.put("Clothing", Arrays.asList(
            new NonElectronics(2001, "T-Shirt", 499),
            new NonElectronics(2002, "Jeans", 999),
            new NonElectronics(2003, "Jacket", 1899),
            new NonElectronics(2004, "Formal Shirt", 899)
        ));

        categoryProducts.put("Footwear", Arrays.asList(
            new NonElectronics(3001, "Sneakers", 1499),
            new NonElectronics(3002, "Sandals", 799),
            new NonElectronics(3003, "Running Shoes", 2499)
        ));

        categoryProducts.put("Books", Arrays.asList(
            new NonElectronics(4001, "Java Basics", 350),
            new NonElectronics(4002, "OOP in Depth", 450),
            new NonElectronics(4003, "Clean Code", 699)
        ));

        categoryProducts.put("Furniture", Arrays.asList(
            new NonElectronics(5001, "Study Table", 2500),
            new NonElectronics(5002, "Chair", 1200),
            new NonElectronics(5003, "Bookshelf", 2800)
        ));
    }

    static void handleAddProduct() {
        System.out.println("\nSelect Category:");
        List<String> categories = new ArrayList<>(categoryProducts.keySet());
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }

        int catChoice = sc.nextInt();
        sc.nextLine();

        if (catChoice < 1 || catChoice > categories.size()) {
            System.out.println("Invalid category!");
            return;
        }

        String selectedCategory = categories.get(catChoice - 1);
        List<Product> products = categoryProducts.get(selectedCategory);

        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            System.out.println("ID: " + p.id + " | Name: " + p.name);
        }

        System.out.print("Enter Product ID to select: ");
        int productId = sc.nextInt();
        sc.nextLine();

        Product selected = null;
        for (Product p : products) {
            if (p.id == productId) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Product not found!");
            return;
        }

        System.out.println("\nProduct Details:");
        System.out.println(selected.getDetails());

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double total = selected.price * qty;
        System.out.println("Total Price: â‚¹" + total);
        cart.addItem(selected, qty);
        System.out.println("Product added to cart successfully!");
    }

    static void handleUpdateQuantity() {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new quantity: ");
        int qty = sc.nextInt();
        cart.updateQuantity(id, qty);
    }

    static void handleRemoveProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = sc.nextInt();
        cart.removeItem(id);
    }
}