public class LifeSupport extends Component{
    //crew, volume, power
    LifeSupport(double crew, double volume, double power){
        this.setProperty("Crew", crew);
        this.setProperty("Volume", volume);
        this.setProperty("Power", power);
    }

    public void addChild(Cargo c){
        this.getChildren().add(c);
        c.setParent(this);
    }
}
