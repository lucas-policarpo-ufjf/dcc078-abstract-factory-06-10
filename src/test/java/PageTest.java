import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PageTest {

  @Test
  void shouldRenderUserViewCorrectly() {
    AbstractFactory factory = new UserFactory();
    Page page = new Page(factory);

    assertEquals("<ul>Lista de usuários<li>A</li></ul>", page.renderListView());
  }

  @Test
  void shouldRenderAdminViewCorrectly() {
    AbstractFactory factory = new AdminFactory();
    Page page = new Page(factory);

    assertEquals("<ul>Lista de administradores<li>A</li></ul>", page.renderListView());
  }

  @Test
  void shouldRenderUserProfileServiceCorrectly() {
    AbstractFactory factory = new UserFactory();
    Page page = new Page(factory);

    assertEquals("perfil usuário", page.getProfileService());
  }

  @Test
  void shouldRenderAdminProfileServiceCorrectly() {
    AbstractFactory factory = new AdminFactory();
    Page page = new Page(factory);

    assertEquals("perfil administrador", page.getProfileService());
  }
}
