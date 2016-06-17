public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
       System.out.println(this.name + "........相貌好");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "........身材好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "........气质好");
    }
}
