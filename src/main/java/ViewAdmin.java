import java.util.ArrayList;

public class ViewAdmin implements View {
    public String renderList(ArrayList<String> list){
        StringBuilder renderResult = new StringBuilder();
        renderResult.append("<h1>Lista de administradores:</h1><ul>");
        for (String s : list) {
            renderResult.append("<li>");
            renderResult.append(s);
            renderResult.append("</li>");
        }
        renderResult.append("</ul>");
        return renderResult.toString();
    }
}
