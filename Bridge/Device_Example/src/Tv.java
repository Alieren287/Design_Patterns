public class Tv implements Device {
    boolean isEnabled = false;
    int volume = 0;
    int channel = 1;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
    @Override
    public void enable() {
        isEnabled = true;
    }
    @Override
    public void disable() {
        isEnabled = false;
    }
    @Override
    public int getVolume() {
        return volume;
    }
    @Override
    public void setVolume(int percent) {
        volume = percent;
    }
    @Override
    public int getChannel() {
        return channel;
    }
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
