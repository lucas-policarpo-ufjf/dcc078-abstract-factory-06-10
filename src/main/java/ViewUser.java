import java.util.ArrayList;

public class ViewUser implements View {
    public String renderList(ArrayList<String> list){
        StringBuilder renderResult = new StringBuilder();
        renderResult.append("<h1>Lista de usuários:</h1><ul>");
        for (String s : list) {
            renderResult.append("<li>");
            renderResult.append(s);
            renderResult.append("</li>");
        }
        renderResult.append("</ul>");
        return renderResult.toString();
    }
}
