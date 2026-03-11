public class ClothingProduct extends Product {

    public ClothingProduct(String id, String name, double price, int stock) {
        super(id, name, price, stock);
    }

    @Override
    public double calculateDiscount() {

        if (stock > 20) {
            return price * 0.15;
        }
        return 0;
    }
}