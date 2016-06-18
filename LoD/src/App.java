import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Girl> girls = new ArrayList<Girl>();

        for (int i = 0; i < 20; ++i) {
            girls.add(new Girl());
        }

        Teacher teacher = new Teacher();
        GroupLeader leader = new GroupLeader(girls);
        teacher.command(leader);
    }
}
