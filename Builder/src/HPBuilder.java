import java.util.ArrayList;

public class HPBuilder extends ComputerBuilder{
    private HP hp = new HP();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.hp.setSequence(sequence);
    }

    @Override
    public ComputerModel getComputerModel() {
        return this.hp;
    }
}
