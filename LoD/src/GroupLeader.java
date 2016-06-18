import java.util.List;

public class GroupLeader {
    private List<Girl> girls;

    public GroupLeader(List<Girl> girls) {
        this.girls = girls;

    }

    public void countGirls(){
        System.out.println(girls.size());
    }
}
