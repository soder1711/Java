import java.util.ArrayList;
public class SafeArray {
    private ArrayList<Integer> list;
    public SafeArray() {
        list = new ArrayList<>();
    }
    public synchronized void add(int item) {
        list.add(item);
        System.out.println(item + " has been added");
    }
    public synchronized void remove(int item) {
        list.remove(item);
        System.out.println(item + " has been removed");
    }
    public synchronized int size() {
        return list.size();
    }
    public synchronized int get(int i) {
        return list.get(i);
    }
}
