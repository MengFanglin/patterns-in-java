import java.util.ArrayList;

public class Maker {
    private ArrayList<String> sequence;
    private HPBuilder hpBuilder;
    private MacBuilder macBuilder;

    public Maker() {
        sequence = new ArrayList<>();
        hpBuilder = new HPBuilder();
        macBuilder = new MacBuilder();
    }

    public ComputerModel getAMac() {
        this.sequence.clear();
        sequence.add("monitor");
        sequence.add("keyboard");
        sequence.add("sound");
        macBuilder.setSequence(this.sequence);
        return macBuilder.getComputerModel();
    }

    public ComputerModel getBMac() {
        this.sequence.clear();
        sequence.add("keyboard");
        sequence.add("sound");
        sequence.add("monitor");
        macBuilder.setSequence(this.sequence);
        return macBuilder.getComputerModel();
    }

    public ComputerModel getAHP() {
        this.sequence.clear();
        sequence.add("sound");
        sequence.add("monitor");
        sequence.add("keyboard");
        hpBuilder.setSequence(this.sequence);
        return hpBuilder.getComputerModel();
    }

    public ComputerModel getBHP() {
        this.sequence.clear();
        sequence.add("monitor");
        sequence.add("sound");
        sequence.add("keyboard");
        hpBuilder.setSequence(this.sequence);
        return hpBuilder.getComputerModel();
    }

}
