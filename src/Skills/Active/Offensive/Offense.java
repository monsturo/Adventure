package Skills.Active.Offensive;

import Creatures.Creature;

import java.util.Random;

public abstract class Offense {
    Random random = new Random();
    public enum Type {
            PHYS, MAG, BOTH;
    }
    public Type type;
    public double chance;

    public Offense(double chance, Type type){
        this.chance = chance;
        this.type = type;
    }

    public boolean attempt(Creature c1, Creature c2, int round){
        if (random.nextInt(100) < chance) {
            use(c1, c2, round);
            return true;
        }
        return false;
    }

    public abstract void use(Creature c1, Creature c2, int round);

    public void defence(Creature c, int damage, Offense.Type type){
        if (type.equals(Offense.Type.PHYS)){
            System.out.println(" for " + (damage - c.getDef() + " damage!"));
            c.setTempHp(c.getTempHp() - Math.max(0, damage));
            if (c.getTempHp() <= 0) {
                System.out.println(c.getName() + " has died!");
            }
        } else {
            System.out.println(" for " + (damage - c.getmDef() + " damage!"));
            c.setTempHp(c.getTempHp() - Math.max(0, damage));
            if (c.getTempHp() <= 0) {
                System.out.println(c.getName() + " has died!");
            }
        }
    }
}
