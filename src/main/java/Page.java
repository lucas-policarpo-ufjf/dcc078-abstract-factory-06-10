
public class Page {
    private View view;
    private Service service;

    public Page(AbstractFactory factory) {
        this.view = factory.createView();
        this.service = factory.createService();
    }

    public String renderListView() {
        return this.view.renderList();
    }

    public String getProfileService() {
        return this.service.getProfile();
    }

}
