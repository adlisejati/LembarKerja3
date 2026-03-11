public class FoodProduct extends Product {

    public FoodProduct(String id, String name, double price, int stock) {
        super(id, name, price, stock);
    }

    @Override
    public double calculateDiscount() {

        if (stock > 10) {
            return price * 0.10;
        }
        return 0;
    }
}