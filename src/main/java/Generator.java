public class Generator extends Component{
    //power, capacity
    Generator(double power, double capacity){
        this.setProperty("Power", power);
        this.setProperty("Capacity", capacity);
    }

    public void addChild(Engine c){
        this.getChildren().add(c);
        c.setParent(this);
    }

    public void addChild(Shield c){
        this.getChildren().add(c);
        c.setParent(this);
    }
}
