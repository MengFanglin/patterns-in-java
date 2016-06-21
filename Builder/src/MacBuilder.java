import java.util.ArrayList;

public class MacBuilder extends ComputerBuilder{
    private MAC mac = new MAC();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.mac.setSequence(sequence);
    }

    @Override
    public ComputerModel getComputerModel() {
        return this.mac;
    }
}
