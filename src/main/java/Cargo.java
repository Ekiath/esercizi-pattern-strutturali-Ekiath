public class Cargo extends Component{
    //storage, crew, volume
    Cargo(double storage, double crew, double volume){
        this.setProperty("Storage", storage);
        this.setProperty("Crew", crew);
        this.setProperty("Volume", volume);
}
}
