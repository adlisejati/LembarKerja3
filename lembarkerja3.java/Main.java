public class Main {

    public static void main(String[] args) {

        Product[] products = new Product[6];

        products[0] = new FoodProduct("F01", "Milk", 20000, 20);
        products[1] = new FoodProduct("F02", "Bread", 15000, 5);
        products[2] = new ElectronicProduct("E01", "Handphone", 600000, 10);
        products[3] = new ElectronicProduct("E02", "Mouse", 200000, 15);
        products[4] = new ClothingProduct("C01", "T-Shirt", 100000, 25);
        products[5] = new ClothingProduct("C02", "Jacket", 300000, 8);

        System.out.println("=================================");
        System.out.println("         FILKOM MART POS         ");
        System.out.println("=================================\n");

        System.out.println("============= PRODUCT LIST =============");
        System.out.printf("%-4s %-12s %-10s %-6s %-10s\n",
                "ID", "Product", "Price", "Stock", "Discount");
        System.out.println("----------------------------------------");

        for (Product p : products) {

            System.out.printf("%-4s %-12s %-10.0f %-6d %-10.0f\n",
                    p.getId(),
                    p.getName(),
                    p.getPrice(),
                    p.getStock(),
                    p.calculateDiscount());
        }

        System.out.println("----------------------------------------\n");

        Transaction t1 = new Transaction("T01");
        t1.addItem(products[0]);
        t1.addItem(products[2]);

        Transaction t2 = new Transaction("T02");
        t2.addItem(products[3]);
        t2.addItem(products[4]);

        double total1 = t1.processSale();
        double total2 = t2.processSale();

        double totalSales = total1 + total2;

        System.out.println("============== SALES ==============");
        System.out.printf("Transaction 1 Total : %.0f\n", total1);
        System.out.printf("Transaction 2 Total : %.0f\n", total2);
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL SALES         : %.0f\n", totalSales);
        System.out.println("===================================");
    }
}