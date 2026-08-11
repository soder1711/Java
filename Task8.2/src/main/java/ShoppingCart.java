import java.util.HashMap;
public class ShoppingCart {
    private HashMap<String, Double> cart;
    public ShoppingCart() {
        cart = new HashMap<>();
    }
    public void addItem(String name, double price) {
        cart.put(name, price);
    }
    public void removeItem(String name) {
        cart.remove(name);
    }
    public int getItemCount() {
        return cart.size();
    }
    public double calculateTotal() {
        double total = 0;
        for (double price: cart.values()) {
            total += price;
        }
        return total;
    }
}
