package Skills.Active.Defensive;

import Creatures.Creature;
import Skills.Active.Offensive.Offense;

import java.util.Random;

public abstract class Defence {
    Random random = new Random();
    public Offense.Type type;
    public double chance;

    public Defence(double chance, Offense.Type type){
        this.chance = chance;
        this.type = type;
    }

    public boolean attempt(Creature c, int damage, Offense.Type type){
        if (random.nextInt(100) < chance) {
            use(c, damage, type);
            return true;
        }
        return false;
    }

    public abstract void use(Creature c, int damage, Offense.Type type);

}
