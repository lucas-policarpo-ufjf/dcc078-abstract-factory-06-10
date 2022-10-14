public class AdminFactory implements AbstractFactory {
  @Override
  public Service createService() {
    return new ServiceAdmin();
  }

  @Override
  public View createView() {
    return new ViewAdmin();
  }
}
