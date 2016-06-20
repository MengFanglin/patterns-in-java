public abstract class ComputerModel {
    protected abstract void setMonitor();

    protected abstract void setKeyboard();

    protected abstract void setSound();

    public void run() {
        this.setMonitor();
        this.setKeyboard();
        this.setSound();
    }
}
