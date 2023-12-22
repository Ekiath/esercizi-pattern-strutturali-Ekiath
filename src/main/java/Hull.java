public class Hull extends Component{
    //mass, durability, volume, hardpoints
    Hull(double mass, double durability, double volume, double hardpoints){
        this.setParent(null);
        this.setProperty("Mass", mass);
        this.setProperty("Durability", durability);
        this.setProperty("Volume", volume);
        this.setProperty("Hardpoints", hardpoints);
    }

    public void addChild(Generator c){
        this.getChildren().add(c);
        c.setParent(this);
    }

    public void addChild(Weapon c){
        this.getChildren().add(c);
        c.setParent(this);
    }

    public void addChild(LifeSupport c){
        this.getChildren().add(c);
        c.setParent(this);
    }
}
