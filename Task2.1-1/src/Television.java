public class Television {

    private boolean on;
    private int channel;

    public Television() {
        channel = 1;
        on = false;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
        if (channel > 10) {
            channel = 1;
        }
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        on = !on;
    }
}

