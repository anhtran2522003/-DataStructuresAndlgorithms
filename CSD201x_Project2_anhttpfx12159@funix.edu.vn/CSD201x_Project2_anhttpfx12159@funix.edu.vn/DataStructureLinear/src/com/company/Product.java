package com.company;

/**
 * Product class
 */
public class Product {


    private String bcode, title;
    private int quantity;
    private double price;

    /**
     * Default constructor
     */
    public Product() {
    }

    public Product(String line) {
        parse(line);
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Constructor method to initialize a product
     *
     * @param bcode    Product's bar code
     * @param title    Product's title
     * @param quantity Product's quantity
     * @param price    Product's price
     */
    public Product(String bcode, String title, int quantity, double price) {
        this.bcode = bcode;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBcode() {
        return bcode;
    }

    public String getFileLine() {
        return bcode + "," + title + "," + quantity + "," + price;
    }

    /**
     * @param line read data from -> save into PProduct
     */
    public void parse(String line) {
        String[] params = line.split(",");
        try {
            bcode = params[0];
            title = params[1];
            quantity = Integer.parseInt(params[2]);
            price = Double.parseDouble(params[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
        } finally {
        }
    }

    /**
     * Convert this product to String for printing
     */
    @Override
    public String toString() {
        return bcode + " | " + title + " | " + quantity + " | " + price;
    }
}
