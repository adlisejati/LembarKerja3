public class ElectronicProduct extends Product {

    public ElectronicProduct(String id, String name, double price, int stock) {
        super(id, name, price, stock);
    }

    @Override
    public double calculateDiscount() {

        if (price > 500000) {
            return price * 0.07;
        }
        return price * 0.05;
    }
}