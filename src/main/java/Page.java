import java.util.ArrayList;

public class Page {
    private View view;
    private Service service;

    public Page (AbstractFactory factory) {
        this.view = factory.createView();
        this.service = factory.createService();
    }

    public String renderView(ArrayList<String> list){
        return this.view.renderList(list);
    }

    public ArrayList<String> findAllServices(){
        return this.service.findAll();
    }

}
