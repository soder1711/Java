import java.util.ArrayList;
public class NumberCalculator extends Thread {
    private int[] list;
    private int start;
    private int end;
    private int sum;
    public static final int size = 100000;
    public NumberCalculator (int[] list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
        sum = 0;
    }
    public int getSum() {
        return sum;
    }
    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += list[i];
            Thread.yield();
        }
    }
    public static void execute(int[] list, int cores) {
        ArrayList<NumberCalculator> numberCalculator = new ArrayList<>();
        double sliceSize = (double)list.length/cores;
        for (int i = 0; i < cores; i++) {
            int slicestart = (int)Math.round(i*sliceSize);
            int sliceend = size;
            if (i < cores-1) {
                sliceend = (int) Math.round((i + 1) * sliceSize);
            }
            numberCalculator.add(new NumberCalculator(list, slicestart, sliceend));
        }
        long start = System.nanoTime();
        for (NumberCalculator number : numberCalculator) {
            number.start();
        }
        int result = 0;
        for (NumberCalculator number : numberCalculator) {
            try {
                number.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result += number.getSum();
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed " + timeElapsed/10e6 + " ms. The result is " + result);
    }
    public static void main(String[] args) {
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = (int) (Math.random() * 5) + 1;
        }
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.print("1 Thread(s): "); execute(list, 1);
        System.out.print("1 Thread(s): "); execute(list, 1);
        System.out.print(cores + " Thread(s): "); execute(list, cores);
    }
}
