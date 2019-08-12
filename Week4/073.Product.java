
public class Product {

    private double price;
    private String name;
    private int amount;

    public Product(String nameStart, double priceStart, int amountStart) {
        this.name = nameStart;
        this.price = priceStart;
        this.amount = amountStart;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + "amount " + this.amount);
    }
}
