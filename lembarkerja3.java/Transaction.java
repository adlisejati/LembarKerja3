public class Transaction {

    private String transactionId;
    private Product[] items = new Product[10];
    private int itemCount = 0;

    public Transaction(String transactionId) {
        this.transactionId = transactionId;
    }

    public void addItem(Product item) {
        items[itemCount++] = item;
    }

    public void addItem(Product item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            items[itemCount++] = item;
        }
    }

    public double processSale() {

        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice() - items[i].calculateDiscount();
        }

        return total;
    }
}