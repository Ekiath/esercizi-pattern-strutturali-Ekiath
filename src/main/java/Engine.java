public class Engine extends Component {
    //power, thrust, turn
    Engine(double power, double thrust, double turn) {
        this.setProperty("Power", power);
        this.setProperty("Thrust", thrust);
        this.setProperty("Turn", turn);
    }
}

