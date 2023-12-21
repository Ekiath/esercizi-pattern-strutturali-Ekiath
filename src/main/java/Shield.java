public class Shield extends Component{
    //power, durability, recharge
    Shield(double power, double durability, double recharge) {
        this.setProperty("Power", power);
        this.setProperty("Thrust", durability);
        this.setProperty("Turn", recharge);
}}
