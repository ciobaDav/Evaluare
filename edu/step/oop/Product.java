package edu.step.oop;

public class Product {

    private final int productId;
    private final String name;
    private final double price;
    private int quantity;


    public Product(int productId) {
        this.productId = productId;
        this.name = "  ";
        this.price = 0.0;
        this.quantity = 0;
    }


    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }


    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }

    // Actualizarea  cantitatii disponibile în stoc
    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Cantitatea trebuie să fie mai mare sau egală cu zero.");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 1500.0, 10);

        System.out.println("Prețul produsului " + product1.name + " este: " + product1.getPrice());


        product1.updateQuantity(5);
        System.out.println("Cantitatea actualizată a produsului " + product1.name + " este: " + product1.quantity);
    }
}






