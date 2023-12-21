public class Hull extends Component{
    //mass, durability, cargo
    Hull(double mass, double durability, double cargo){
        this.setParent(null);
        this.setProperty("Mass", mass);
        this.setProperty("Durability", durability);
        this.setProperty("Cargo", cargo);
    }

    public void addChild(Generator g){
        this.getChildren().add(g);
    }

    public void addChild(Weapon w){
        this.getChildren().add(w);
    }

    public void addChild(LifeSupport l){
        this.getChildren().add(l);
    }
}
