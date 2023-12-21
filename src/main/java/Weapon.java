public class Weapon extends Component{
    //damage, range, ammo
    Weapon(double damage, double range, double ammo, double hardpoints){
        this.setProperty("Damage", damage);
        this.setProperty("Range", range);
        this.setProperty("Ammo", ammo);
        this.setProperty("Hardpoints", hardpoints);
    }
}
