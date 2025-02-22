package Bai1_5;

public class Invoice {

    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public Invoice(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public String getId() {
        return id;
    }
    public String getDesc() {
        return description;
    }
    public int getQty() {
        return quantity;
    }
    public void setQty(int quantity) {
        this.quantity = quantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice * quantity;
    }
    public String toString() {
        return "InvoiceItem[id=" + id + ", description =" + description + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";

    }

}

