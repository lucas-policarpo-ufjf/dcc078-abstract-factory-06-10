import java.util.ArrayList;

public class ServiceAdmin implements Service {
    public ArrayList<String> findAll(){
        return new ArrayList<String>() {{
            add("A");
            add("B");
        }};
    }
}
