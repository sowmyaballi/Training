/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
// Base class
class FoodItem {
    String itemId;
    String itemName;
    double unitPrice;
    int quantity;

    // Constructor
    FoodItem(String itemId, String itemName, double unitPrice, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Method to calculate bill (to be overridden)
    double calculateBill() {
        double subtotal = unitPrice * quantity;
        double gst = 0.05 * subtotal;
        double total = subtotal + gst;
        if (total > 1000) {
            total -= 0.10 * total;
        }
        return total;
    }

    // Method to display details (to be overridden)
    void displayDetails() {
        System.out.println("Food Item Record");
        System.out.println("ID " + itemId);
        System.out.println("Name " + itemName);
        System.out.println("Unit Price " + unitPrice);
        System.out.println("Quantity " + quantity);
    }
}

// DineIn class
class DineIn extends FoodItem {
    double serviceCharge;

    DineIn(String itemId, String itemName, double unitPrice, int quantity, double serviceCharge) {
        super(itemId, itemName, unitPrice, quantity);
        this.serviceCharge = serviceCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity;
        double totalBeforeTax = subtotal + serviceCharge;
        double gst = 0.05 * totalBeforeTax;
        double total = totalBeforeTax + gst;
        double discount = 0;
        if (total > 1000) {
            discount = 0.10 * total;
            total -= discount;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity;
        double totalBeforeTax = subtotal + serviceCharge;
        double gst = 0.05 * totalBeforeTax;
        double total = totalBeforeTax + gst;
        double discount = 0;
        if (total > 1000) {
            discount = 0.10 * total;
            total -= discount;
        }
        super.displayDetails();
        System.out.println("Service Charge " + serviceCharge);
        System.out.println("Subtotal " + subtotal);
        System.out.printf("GST %.2f\n", gst);
        System.out.printf("Discount %.2f\n", discount);
        System.out.printf("Total Bill %.2f\n\n", total);
    }
}

// Takeaway class
class Takeaway extends FoodItem {
    double packingCharge;

    Takeaway(String itemId, String itemName, double unitPrice, int quantity, double packingCharge) {
        super(itemId, itemName, unitPrice, quantity);
        this.packingCharge = packingCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity;
        double totalBeforeTax = subtotal + packingCharge;
        double gst = 0.05 * totalBeforeTax;
        double total = totalBeforeTax + gst;
        double discount = 0;
        if (total > 1000) {
            discount = 0.10 * total;
            total -= discount;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity;
        double totalBeforeTax = subtotal + packingCharge;
        double gst = 0.05 * totalBeforeTax;
        double total = totalBeforeTax + gst;
        double discount = 0;
        if (total > 1000) {
            discount = 0.10 * total;
            total -= discount;
        }
        super.displayDetails();
        System.out.println("Packing Charge " + packingCharge);
        System.out.println("Subtotal " + subtotal);
        System.out.printf("GST %.2f\n", gst);
        System.out.printf("Discount %.2f\n", discount);
        System.out.printf("Total Bill %.2f\n\n", total);
    }
}

// Delivery class
class Delivery extends FoodItem {
    double deliveryFee;

    Delivery(String itemId, String itemName, double unitPrice, int quantity, double deliveryFee) {
        super(itemId, itemName, unitPrice, quantity);
        this.deliveryFee = deliveryFee;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity;
        double totalBeforeTax = subtotal + deliveryFee;
        double gst = 0.05 * totalBeforeTax;
        double total = totalBeforeTax + gst;
        double discount = 0;
        if (total > 1000) {
            discount = 0.10 * total;
            total -= discount;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity;
        double totalBeforeTax = subtotal + deliveryFee;
        double gst = 0.05 * totalBeforeTax;
        double total = totalBeforeTax + gst;
        double discount = 0;
        if (total > 1000) {
            discount = 0.10 * total;
            total -= discount;
        }
        super.displayDetails();
        System.out.println("Delivery Fee " + deliveryFee);
        System.out.println("Subtotal " + subtotal);
        System.out.printf("GST %.2f\n", gst);
        System.out.printf("Discount %.2f\n", discount);
        System.out.printf("Total Bill %.2f\n\n", total);
    }
}

// Main class
public class RestaurantBillingSystem1 {
    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[3];

        items[0] = new DineIn("F101", "Paneer Butter Masala", 250.0, 4, 50.0);
        items[1] = new Takeaway("F102", "Veg Biryani", 180.0, 2, 20.0);
        items[2] = new Delivery("F103", "Chicken Pizza", 300.0, 4, 40.0);

        for (FoodItem item : items) {
            item.displayDetails(); // Runtime Polymorphism in action
        }
    }
}

