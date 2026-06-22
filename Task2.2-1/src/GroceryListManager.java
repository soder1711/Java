import java.util.ArrayList;
public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    public void addItem(String item) {
        groceryList.add(item);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void displayList() {
        System.out.println("The list contains: ");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }
    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItem("Apples");
        list.addItem("Milk");
        list.addItem("Bread");
        System.out.println("is Milk in the grocery list? " + list.checkItem("Milk"));
        System.out.println("Removing Milk from the list...");
        list.removeItem("Milk");
        list.displayList();
    }
}
