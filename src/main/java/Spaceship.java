import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

import static java.lang.Double.max;

public class Spaceship {
    private Hull hull;
    private double mass, durability, volume, hardpoints, power, capacity, thrust, turn, recharge, damage, range, ammo, crew, storage;
    private final LinkedHashMap<String, Double> stats = new LinkedHashMap<>();

    Spaceship(Hull h){
        hull = h;
    }

    ArrayList<Component> visitChildren(Component c){
        ArrayList<Component> list = new ArrayList<>();
        for (Component comp: c.getChildren()){
            list.addAll(visitChildren(comp));
        }
        list.add(c);
        return list;
    }

    void showStatistics(){
        ArrayList<Component> list = visitChildren(hull);
        for (Component comp: list){
            Set<String> keys = comp.getKeys();
            for (String k: keys){
                Double value = comp.getProperty(k);
                switch (k){
                    case "Mass" -> mass += value;
                    case "Durability" -> durability += value;
                    case "Volume" -> volume += value;
                    case "Hardpoints" -> hardpoints += value;
                    case "Power" -> power += value;
                    case "Capacity" -> capacity += value;
                    case "Thrust" -> thrust += value;
                    case "Turn" -> turn += value;
                    case "Recharge" -> recharge += value;
                    case "Damage" -> damage += value;
                    case "Range" -> range = max(range, value);
                    case "Ammo" -> ammo += value;
                    case "Crew" -> crew += value;
                    case "Storage" -> storage += value;
                }
            }
        }
        System.out.println("Spaceship Statistics:");
        System.out.println("---Defenses---");
        System.out.println("Mass: " + mass);
        System.out.println("Durability: " + durability + " (shield recharge: " + recharge + ")");
        System.out.println("Power Generation: " + power);
        System.out.println("Generator Capacity: " + capacity);
        System.out.println("---Mobility---");
        System.out.println("Thrust: " + thrust);
        System.out.println("Turn: " + turn);
        System.out.println("---Weapons---");
        System.out.println("Total Damage: " + damage);
        System.out.println("Maximum Range: " + range);
        System.out.println("Total Ammo: " + ammo);
        System.out.println("Remaining Hardpoints: " + hardpoints);
        System.out.println("---Crew & Cargo---");
        System.out.println("Crew: " + crew);
        System.out.println("Storage: " + storage);
        System.out.println("Remaining Volume: " + volume);
        System.out.println("---------");
    }
}
