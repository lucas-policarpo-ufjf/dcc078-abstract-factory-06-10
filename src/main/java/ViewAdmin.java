
public class ViewAdmin implements View {
    public String renderList() {
        StringBuilder renderResult = new StringBuilder();
        renderResult.append("<ul>Lista de administradores");
        renderResult.append("<li>A</li>");
        renderResult.append("</ul>");
        return renderResult.toString();
    }
}
