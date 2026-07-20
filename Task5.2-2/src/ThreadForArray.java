public class ThreadForArray implements Runnable {
    private SafeArray list;

    public ThreadForArray(SafeArray list) {
        this.list = list;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
