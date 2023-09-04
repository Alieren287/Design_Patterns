public class RemoteControl {
    protected Device device;

    void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        }
        else
            device.enable();
    }

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
