import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItems> groceryList = new ArrayList<>();
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(new GroceryItems(item, cost, category, quantity));
    }
    public void updateQuantity(String item, int newQuantity) {
        for (GroceryItems grocery : groceryList) {
            if (grocery.item.equals(item)) {
                grocery.quantity = newQuantity;
            }
        }
    }
    public void displayByCategory(String category) {
        for (GroceryItems grocery : groceryList) {
            if (grocery.quantity > 0) {
                System.out.println(grocery.item + ", Quantity: " + grocery.quantity);
            }
        }
    }
    public double calculateTotalCost() {
        double total = 0;
        for (GroceryItems grocery : groceryList) {
            total += grocery.cost * grocery.quantity;
        }
        return total;
    }
    public void displayAvailableItems() {
        for (GroceryItems grocery : groceryList) {
            if (grocery.quantity > 0) {
                System.out.println(grocery.item + " Quantity: " + grocery.quantity);
            }
        }
    }
    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItem("Apple", 2.5, "Fruit", 5);
        list.addItem("Milk", 1.5, "Dairy", 0);
        System.out.println("Total Cost: " + list.calculateTotalCost());
        System.out.println("Fruits:");
        list.displayByCategory("Fruit");
        list.updateQuantity("Apple", 5);
        list.displayAvailableItems();
    }
}