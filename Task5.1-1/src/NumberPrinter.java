public class NumberPrinter extends Thread {
    private final int maxNumber;
    private final int lowestNumber;
    private final String threadName;

    public NumberPrinter(int lowestNumber, int maxNumber, String threadName) {
        this.maxNumber = maxNumber;
        this.lowestNumber = lowestNumber;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        int i = lowestNumber;
        while (i < maxNumber) {
            System.out.println(threadName + ": " + i);
            i += 2;
        }
    }

    public static void main(String[] args) {
        NumberPrinter oddNumber = new NumberPrinter(1, 20, "Odd Thread");
        NumberPrinter evenNumber = new NumberPrinter(2, 20, "Even Thread");
        evenNumber.start();
        oddNumber.start();
    }
}
