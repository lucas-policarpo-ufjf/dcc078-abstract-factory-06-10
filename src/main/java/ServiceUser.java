import java.util.ArrayList;

public class ServiceUser implements Service {
    public ArrayList<String> findAll(){
        return new ArrayList<String>() {{
            add("C");
            add("D");
        }};
    }
}
