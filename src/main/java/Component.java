import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Component {
    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public ArrayList<Component> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Component> children) {
        this.children = children;
    }

    private Component parent;
    private ArrayList<Component> children;
    private LinkedHashMap<String, Double> property;

    public Double getProperty(String s) {
        return property.get(s);
    }

    public String getStringProperty(String s) {
        return s+": "+property.get(s).toString();
    }

}
