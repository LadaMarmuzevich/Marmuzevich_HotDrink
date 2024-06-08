import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private final List<Product> productList;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }
    
    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
                
            }
        }
        return null;
    }
    public HotDrink getProduct(String name, int volume, int temp) {
        return new HotDrinkTemperature(name, volume, temp);
    }
}
