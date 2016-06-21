import java.util.ArrayList;

public abstract class ComputerModel {
    private ArrayList<String> sequence;

    protected abstract void setMonitor();

    protected abstract void setKeyboard();

    protected abstract void setSound();

    final public void run() {
        String actionName = null;
        for (int i = 0; i < this.sequence.size(); ++i) {
            actionName = this.sequence.get(i);
            if ("monitor".equals(actionName)) {
                this.setMonitor();
            }else if("keyboard".equals(actionName)){
                this.setKeyboard();
            }else if("sound".equals(actionName)){
                this.setSound();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
