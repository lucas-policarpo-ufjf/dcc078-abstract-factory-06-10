public class UserFactory implements AbstractFactory {
  @Override
  public Service createService() {
    return new ServiceUser();
  }

  @Override
  public View createView() {
    return new ViewUser();
  }
}
