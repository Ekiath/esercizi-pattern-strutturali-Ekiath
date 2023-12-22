public class Assembler {
    static {
        Hull hull = new Hull(50000, 500, 2500000, 8);
        Generator generator = new Generator(3000, 100000);
        Engine engine = new Engine(-1000, 200, 150);
        Shield shield = new Shield(-500, 200, 35);
        Weapon laser1 = new Weapon(10, 6000, 0, -1);
        Weapon laser2 = new Weapon(10, 6000, 0, -1);
        Weapon missile1 = new Weapon(30, 500, 100, -1);
        Weapon missile2 = new Weapon(30, 500, 100, -1);
        Weapon mainCannon = new Weapon(750, 100, 5, -3);
        LifeSupport lifeSupport = new LifeSupport(100, -75000, -365.87);
        Cargo cargo = new Cargo(650000, -42, -2000000);

        hull.addChild(generator);
        generator.addChild(engine);
        generator.addChild(shield);
        hull.addChild(laser1);
        hull.addChild(laser2);
        hull.addChild(missile1);
        hull.addChild(missile2);
        hull.addChild(mainCannon);
        hull.addChild(lifeSupport);
        lifeSupport.addChild(cargo);

        Spaceship spaceship = new Spaceship(hull);
        spaceship.showStatistics();
        }
    }

