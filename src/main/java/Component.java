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

    public Component getChild(int i) {
        return children.get(i);
    }

    public void addChild(Component child) {}

    public void removeChild(int i) {
        this.children.remove(i);
    }

    private Component parent;
    private ArrayList<Component> children;
    private LinkedHashMap<String, Double> property;

    public void setProperty(String s, double d){
        property.put(s, d);
    }

    public Double getProperty(String s) {
        return property.get(s);
    }

    public String getStringProperty(String s) {
        return s+": "+property.get(s).toString();
    }

}
